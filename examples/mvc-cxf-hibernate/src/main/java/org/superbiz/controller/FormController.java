package org.superbiz.controller;

import org.superbiz.model.Form;
import org.superbiz.model.Messages;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.mvc.Models;

@Controller
@Path("form")
public class FormController {
    @Inject
    private Messages message;

    @Inject
    Models models;

    @Inject
    private Form form;

    @GET
    @Path("new")
    //@View("form.jsp")
    public String newForm() {
        return "form.jsp";
    }

    @POST
    @Path("return")
    @View("formReturn.jsp")
    public void returnPage(@BeanParam Form inForm) {
        form.setFormName(inForm.getFormName());
        form.setFormAge(inForm.getFormAge());
    }
}
