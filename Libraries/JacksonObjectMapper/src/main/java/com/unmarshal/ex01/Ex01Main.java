package com.unmarshal.ex01;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Ex01Main {
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		Logger logger = LoggerFactory.getLogger(Ex01Main.class);

		final var json = "{\"name\":\"Maria da Silva\"}";
		final var ObjectMapper = new ObjectMapper();
		final var person = ObjectMapper.readValue(json, Person.class);
		
		System.out.print(person);

		logger.info("Person: {}", person.getName());
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
