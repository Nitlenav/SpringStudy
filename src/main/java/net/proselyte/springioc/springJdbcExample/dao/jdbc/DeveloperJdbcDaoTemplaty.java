package net.proselyte.springioc.springJdbcExample.dao.jdbc;

import net.proselyte.springioc.springJdbcExample.dao.DeveloperDao;
import net.proselyte.springioc.springJdbcExample.model.Developer;
import net.proselyte.springioc.springJdbcExample.util.DeveloperMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class DeveloperJdbcDaoTemplaty implements DeveloperDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;


    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createDeveloper(String name, String specialty, Integer experiency) {
        String SQL = "INSERT INTO DEVELOPERS (name, specialty, experience) VALUES (?, ?, ?)";
        jdbcTemplate.update(SQL, name, specialty, experiency);
        System.out.println("Developer successfully created.\nName: " + name + ";\nSpecilaty: " +
                specialty + ";\nExperience: " + experiency + "\n");
    }

    @Override
    public Developer getDeveloper(Integer id) {
        String SQL = "SEELECT * FROM Develpoers WHERE id = ?";
        Developer developer = (Developer) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new DeveloperMapper());
        return developer;
    }

    @Override
    public List listDevelopers() {
        String SQL = "SELECT * FROM developers.developers";
        List developer = jdbcTemplate.query(SQL, new DeveloperMapper());
        return developer;
    }

    @Override
    public void remoteDeveloper(Integer id) {
        String SQL = "DELETE FROM developers WHERE id = ?";
        jdbcTemplate.update(SQL, id);
        System.out.println("Developer with id: " + id + " successfully removed");
    }

    @Override
    public void updateDeveloper(Integer id, String name, String specialty, Integer experiency) {
        String SQL = "UPDATE DEVELOPERS SET name = ?, specialty = ?, experience = ? WHERE id = ?";
        jdbcTemplate.update(SQL, name, specialty, experiency, id );
        System.out.println("Developer with id: " + id + " successfully updated.");
    }
}
