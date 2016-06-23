package com.vogella.jersey.first;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

public class Test {
	public static void main(String args[])
	{
		ClientConfig config=new ClientConfig();
        Client client=ClientBuilder.newClient(config);
        WebTarget target=client.target(getBaseURI());
         //GET XML
        String xmlResponse=target.path("rest").path("todo").request().accept(MediaType.TEXT_XML).get(String.class);
        System.out.println(xmlResponse);
	}

	private static String getBaseURI() {
		// TODO Auto-generated method stub
		
		return null;
	}
}
