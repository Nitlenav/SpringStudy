package net.proselyte.springioc.springJdbcExample.dao;

import net.proselyte.springioc.springJdbcExample.model.Developer;

import javax.sql.DataSource;
import java.util.List;

public interface DeveloperDao {
    public void setDataSource(DataSource dataSource);
    public void createDeveloper(String name, String specialty, Integer experiency);
    public Developer getDeveloper(Integer id);
    public List listDevelopers();
    public void remoteDeveloper(Integer id);
    public void updateDeveloper(Integer id, String name, String specialty, Integer experiency);
}
