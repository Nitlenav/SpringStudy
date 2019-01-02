package net.proselyte.springioc.aopSpringExampleXml;

public class Developer {
    private String name;
    private String speciality;
    private Integer expirience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getExpirience() {
        return expirience;
    }

    public void setExpirience(Integer expirience) {
        this.expirience = expirience;
    }

    public void someException(){
        System.out.println("We have EXCEPTION here. ");
        throw new ClassCastException();
    }

    @Override
    public String toString() {
        return "\nDeveloper \n" +
                "name = " + name + '\n' +
                "speciality = " + speciality + '\n' +
                "expirience = " + expirience + "\n";
    }
}
