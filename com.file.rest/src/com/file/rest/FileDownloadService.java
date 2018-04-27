package com.file.rest;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/files")
public class FileDownloadService {
	private static final String FILE_PATH = "c:\\myfile.txt";  

	@GET
	@Path("/txt")
	@Produces("text/plain")
	public Response getFile()
	{
		File file=new File(FILE_PATH);
		ResponseBuilder responseBuilder= Response.ok((Object)file);
        responseBuilder.header("Content-Disposition","attachment; filename=\"javatpoint_file.txt\"");
        return responseBuilder.build();

	}
	
	//This is my comment 
    

	
	
}
