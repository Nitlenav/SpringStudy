package net.proselyte.springioc.springJdbcExample;

import net.proselyte.springioc.springJdbcExample.dao.jdbc.DeveloperJdbcDaoTemplaty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DeveloperJdbcRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbc-developer-config.xml");

        DeveloperJdbcDaoTemplaty jdbcTemplateDeveloperDao =
                (DeveloperJdbcDaoTemplaty) context.getBean("jdbcTemplate");

        System.out.println("========Creating new records to DB========");
        jdbcTemplateDeveloperDao.createDeveloper("Proselyte", "Java Developer", 3);
        jdbcTemplateDeveloperDao.createDeveloper("Petr", "C++ Developer", 2);
        jdbcTemplateDeveloperDao.createDeveloper("DesignerAsya", "UI Developer", 1);

        System.out.println("========Developers List========");
        List developers = jdbcTemplateDeveloperDao.listDevelopers();
        for (Object developer : developers) {
            System.out.println(developer);
        }

        System.out.println("========Some changes to DB========");
        jdbcTemplateDeveloperDao.updateDeveloper(33, "DesignerAsya", "UI Developer", 2);
        jdbcTemplateDeveloperDao.remoteDeveloper(32);

        System.out.println("========Final Developers List========");
        List finalDevelopers = jdbcTemplateDeveloperDao.listDevelopers();
        for (Object developer : finalDevelopers) {
            System.out.println(developer);
        }
    }
}
