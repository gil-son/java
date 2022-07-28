package com.builds;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateAnArrayObject {

    public static void main(String [] args) {

        JSONObject my_obj = new JSONObject();

        my_obj.put("title", "A film");
        my_obj.put("year", "1990");
        my_obj.put("genre", "Scientific");


        JSONArray my_array = new JSONArray();
        my_array.put(my_obj.get("title"));
        my_array.put(my_obj.get("year"));
        my_array.put(my_obj.get("genre"));

        System.out.println("result : "+ my_array);

        JSONObject my_obj2 = new JSONObject();
        my_obj2.put("infos", my_array);

        System.out.println("result 2: "+ my_obj2);
    }
}
