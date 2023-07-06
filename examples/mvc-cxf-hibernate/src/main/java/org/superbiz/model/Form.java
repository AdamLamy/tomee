package org.superbiz.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

@Named("form")
@RequestScoped
public class Form {

    @FormParam("formName")
    @NotEmpty(message = "can not be empty")
    @MvcBinding
    @Size(min = 1, max = 20)
    private String formName;

    @FormParam("formAge")
    @MvcBinding
    @Max(100)
    private int formAge;

    public String getFormName() {
        return formName;
    }

    public int getFormAge() {
        return formAge;
    }

    public void setFormName(String name) {
        this.formName = name;
    }

    public void setFormAge(int age) {
        this.formAge = age;
    }
}
