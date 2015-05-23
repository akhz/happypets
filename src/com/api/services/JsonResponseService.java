package com.api.services;

import javax.ws.rs.GET; 
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.simple.JSONObject;

@Path("api")
public class JsonResponseService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJsonResponse()
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "akhil");
		jsonObject.put("age", "25");
		jsonObject.put("method", "default method - getJsonResponse ");
		
		return Response.status(200).entity(jsonObject.toJSONString()).build();
	}
	/*
	@GET
	@Path("/{age}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJsonResponse(@PathParam("age") int intAge)
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "akhil");
		jsonObject.put("age", intAge);
		jsonObject.put("method", "getJsonResponse with PathParam");
		
		return Response.status(200).entity(jsonObject.toJSONString()).build();
	}
	
	@GET
	@Path("/{age}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJsonResponse(@QueryParam("age") String strAge)
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "akhil");
		jsonObject.put("age", strAge);
		jsonObject.put("method", "getJsonResponse with QueryParam");
		
		return Response.status(200).entity(jsonObject.toJSONString()).build();
	}
	
*/
}	
