package com.file.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/student")
public class StudentInfo {
	@GET
	@Path("{studentRollno1}/{studentRollno2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentInfo(@PathParam("studentRollno1") String srno1,
		@PathParam("studentRollno2") String srno2)
	{
		
		return "You Send me two Student Roll number"+srno1+" "+srno2; 
	}
}
