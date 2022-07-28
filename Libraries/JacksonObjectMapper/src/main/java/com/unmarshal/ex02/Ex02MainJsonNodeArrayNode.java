package com.unmarshal.ex02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Ex02MainJsonNodeArrayNode {
    public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

        Logger logger = LoggerFactory.getLogger(Ex02MainJsonNodeArrayNode.class);

        final var json = "{\"name\":\"Maria da Silva\"}";
        final var ObjectMapper = new ObjectMapper();
        final var person = ObjectMapper.readValue(json, Person.class);

        System.out.print(person);

        logger.info("Person: {}", person.getName());

        final var json2 = "{ \"names\" : [ { \"name\":\"aaa\"},{\"name\":\"bbb\"},{\"name\":\"ccc\"}]}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode messageJson = mapper.readTree(json2);

        JsonNode list = messageJson.get("names");

        logger.info(" Names: {}", list);

        if(list.isArray()){

            List<Person> list_name = new ArrayList<>();

            for( JsonNode objNode: list){
                Person person01 = new Person();
                person01.setName(objNode.get("name").asText());
                list_name.add(person01);


            }
            Name names = new Name(list_name);

            logger.info(" Name 0: {}", list_name.get(0).getName());
            logger.info(" Names: {}", list_name);
            logger.info(" Names: {}", names.getListName());

            ArrayNode arrayNode = JsonNodeFactory.instance.arrayNode();

            arrayNode.add(list_name.get(0).getName());
            arrayNode.add(list_name.get(1).getName());
            arrayNode.add(list_name.get(2).getName());

            logger.info(" Names: {}", arrayNode);

        }
    }
}

class Name{

    private List<Person> other_list;

    public Name(){}


    public Name(List<Person> other_list) {
        this.other_list = other_list;
    }

    public List<Person> getListName() {
        return other_list;
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