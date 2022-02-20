package com.marshal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex01Main {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		Person person = new Person();
		
		person.setName("Aaaaa");
		
		final var ObjectMapper = new ObjectMapper();
		String json = ObjectMapper.writeValueAsString(person);
		
		System.out.print(json);
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