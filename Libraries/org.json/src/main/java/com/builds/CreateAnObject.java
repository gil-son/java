package com.builds;

import org.json.JSONException;
import org.json.JSONObject;
//Create an object to save data
public class CreateAnObject {

	public static void main(String [] args) {
		
		
		// intance a new object
		
		JSONObject my_obj = new JSONObject();
		
		my_obj.put("title","A film");
		my_obj.put("year","1990");
		my_obj.put("genre","Scientific");
		
		
		// serializable to a String
		
		String json_string = my_obj.toString();
		System.out.println("result 1: "+json_string);
		
		// alter the title
		
		my_obj.put("title","A other film");
		json_string = my_obj.toString();
		System.out.println("result 2: "+json_string);
		
		
		// recover the properties
		
		String title = my_obj.getString("title");
		Integer year = Integer.parseInt(my_obj.getString(("year")));
		String genre = my_obj.getString("genre");
		
		System.out.println("title: "+title);
		System.out.println("year: "+year);
		System.out.println("genre: "+genre);
		
	}
	
}
