package com.builds;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BuildFromJson {

	public static void main(String [] args) throws JsonMappingException, JsonProcessingException {
		
		
		Logger logger = LoggerFactory.getLogger(BuildFromJson.class);
	    
		// json
		
		final var json = "{\"name\":\"Maria da Silva\"}";
		
		// unmarhsall = json converting to object
		
		final var ObjectMapper = new ObjectMapper();
		final var person = ObjectMapper.readValue(json, Person.class);
	
		logger.info("Person obj: {}", person.getName());
		
		// build a json from a object, is like marshall
		
		JSONObject my_obj = new JSONObject();
		my_obj.put("name",person.getName());
		
		
		logger.info("Person JSONObject: {}", my_obj);
		
	
	}
}



class Person {
	
	private String name;

	// @JsonIgnoreProperties(ignoreUnknown = true)
	private Integer age;
	
	public Person() {}
			
	public Person(String name) {
	    this.name = name;
	  }
	
	
    public String getName() {
      return name;
    }

    public void setName(final String name) {
      this.name = name;
    }

}