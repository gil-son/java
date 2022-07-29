package com.builds;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FromJsonCreatOtherJson {

    public static void main(String[] args) throws JsonProcessingException {

        String anString = "{\"menu\":{\n" +
                "  \"id\": \"file\",\n" +
                "  \"value\": \"File\",\n" +
                "  \"popup\": {\n" +
                "    \"menuitem\": [\n" +
                "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
                "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
                "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
                "    ]\n" +
                "  }\n" +
                "}}";

        // No necessary convert to json

        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree(anString);

        System.out.println("result01:" + json);

        JsonNode listMenu = json.get("menu");

        // Independence convert or no convert, use this part
        System.out.println("result02:" + listMenu);

        // Optional mode:
        // otherMenu.setValue(json.get("menu").get(0).get("value").asDouble());

        // Create a new JSON with customized attributes

        //System.out.println("TEST:" + json.get("menu").get("popup").get("menuitem").get(0));

        JSONObject my_json_obj_menu = new JSONObject();
        JSONObject my_json_obj_attributes_menu = new JSONObject();

        OtherMenu otherMenu = new OtherMenu();



        my_json_obj_attributes_menu.put("new_id",  json.get("menu").get("id").asText());
        my_json_obj_attributes_menu.put("new_value",  json.get("menu").get("value").asText());

        my_json_obj_menu.put("new_menu", my_json_obj_attributes_menu);

        OtherPop otherPop = new OtherPop();

        JSONObject my_json_obj_popup = new JSONObject();

        //my_json_obj_popup.put("the_popup", String.valueOf(listMenu.get("menu").get(0).get("popup").getClass()));

        System.out.println("result03:" + my_json_obj_menu);

    }
}

class OtherMenu{

        private int id;
        private double value;
        private OtherPop popup;

        public OtherMenu(){}

        public OtherMenu(int id, double value, OtherPop popup) {
            this.id = id;
            this.value = value;
            this.popup = popup;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public OtherPop getPopup() {
            return popup;
        }

        public void setPopup(OtherPop popup) {
            this.popup = popup;
        }
}

class OtherPop{

     List<MenuItem> menuItemList = new ArrayList<>();

     public OtherPop(){}

    public OtherPop(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

}

class MenuItem{

        private String value;
        private String onClick;

        public MenuItem(){}

        public MenuItem(String value, String onClick) {
            this.value = value;
            this.onClick = onClick;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getOnClick() {
            return onClick;
        }

        public void setOnClick(String onClick) {
            this.onClick = onClick;
        }
}


