package com.form.rest;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/university")
public class RestFormParameter {
 @POST
 @Path("/add")
 public String getFormData(
	 @FormParam("rollNo") int rollNo,
	 @FormParam("age") int age)
 {
	return "You enter Student Roll number"+rollNo +"  & age"+age;
 }
}
