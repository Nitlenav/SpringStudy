package net.proselyte.springioc.annotationRunnerQualified;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Developer {
    private String name;
    private Integer expirience;
    private String specialty;

    @Autowired
    public Developer(String name, Integer expirience, String specialty) {
        this.name = name;
        this.expirience = expirience;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExpirience() {
        return expirience;
    }

    public void setExpirience(Integer expirience) {
        this.expirience = expirience;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Autowired
    public String toString() {
        return "Developer - " +
                "name = " + name + '\n' +
                "expirience = " + expirience + '\n' +
                "specialty = " + specialty + '\n';
    }
}
