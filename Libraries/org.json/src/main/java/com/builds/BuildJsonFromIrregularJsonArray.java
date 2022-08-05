package com.builds;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BuildJsonFromIrregularJsonArray {

    public static void main(String [] args) throws JsonMappingException, JsonProcessingException {

        Logger logger = LoggerFactory.getLogger(BuildJsonFromIrregularJsonArray.class);

        String anString =
                "{\"menu\":{\"id\":\"file\",\"popup\":{\"menuitem\":[\"person:name:Cloud\",\"person:idade:10\",\"car:Ferrari\"]}}}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree(anString);

        System.out.println("result01:" + json);

        JSONObject my_json_obj_menu = new JSONObject();
        JSONObject my_json_obj_attributes_menu = new JSONObject();

        ArrayNode arrayNode = JsonNodeFactory.instance.arrayNode();

        int min = json.get("menu").get("popup").get("menuitem").get(0).asText().indexOf("p");
        int max = json.get("menu").get("popup").get("menuitem").get(0).asText().length();

        logger.info("menuitem 0: {}", json.get("menu").get("popup").get("menuitem").get(0).asText());
        //logger.info("menuitem 1: {}", json.get("menu").get("popup").get("menuitem").get(0).asText().split(":"));

        logger.info("menuitem 1: {}", json.get("menu").get("popup").get("menuitem").get(0).asText().substring(min, 6));
        logger.info("menuitem 2: {}", json.get("menu").get("popup").get("menuitem").get(0).asText().substring(7, 11));
        logger.info("menuitem 3: {}", json.get("menu").get("popup").get("menuitem").get(0).asText().substring(12, max));

        JSONObject my_json_obj_menu_item = new JSONObject();
        JSONObject my_json_obj_menu_item_person = new JSONObject();
        JSONObject my_json_obj_menu_item_person_attributes = new JSONObject();


        my_json_obj_menu_item_person_attributes.put("new_name",json.get("menu").get("popup").get("menuitem").get(0).asText().substring(12, max));
        my_json_obj_menu_item_person_attributes.put("new_idade",json.get("menu").get("popup").get("menuitem").get(1).asText().substring(13, 15));

        my_json_obj_menu_item_person.put("person", my_json_obj_menu_item_person_attributes);

        my_json_obj_menu_item.put("new_menuitem",my_json_obj_menu_item_person);


        my_json_obj_attributes_menu.put("new_id",  json.get("menu").get("id").asText());
        my_json_obj_attributes_menu.put("new_popup", my_json_obj_menu_item);


        my_json_obj_menu.put("new_menu", my_json_obj_attributes_menu);
        System.out.println("result02:" + my_json_obj_menu);
    }
}
