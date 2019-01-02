package net.proselyte.springioc.annotationRunnerQualified;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Position {
    @Autowired
    @Qualifier("netJavaDeveloper")
    private Developer developer;

    public Position(){}

    public void getDeveloperInfo() {
        System.out.println(this.developer);
    }
}
