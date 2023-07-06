package org.superbiz.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("greeting")
@RequestScoped
public class Greeting {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {return name;}

}
