package net.proselyte.springioc.annotationConfigRequired;

import org.springframework.beans.factory.annotation.Required;

public class Developer {
    private String name;
    private Integer expirience;
    private String specialty;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public Integer getExpirience() {
        return expirience;
    }

    @Required
    public void setExpirience(Integer expirience) {
        this.expirience = expirience;
    }

    public String getSpecialty() {
        return specialty;
    }
    @Required
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Developer - " + '\n' +
                "name = " + name + '\n' +
                "expirience = " + expirience + '\n' +
                "specialty = " + specialty + '\n';
    }
}
