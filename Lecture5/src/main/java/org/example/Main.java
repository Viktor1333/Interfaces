package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws Exception{
            ObjectMapper map =  new ObjectMapper();
            Student student = new Student("Angel", 20, "mail");


            String json = map.writeValueAsString(student);

            System.out.println("Serialized student json: " + json);

            Student deserialized = map.readValue(json, Student.class);
            System.out.println("Deserialized student json name: " + deserialized.getName());
            System.out.println("Deserialized student json age: " + deserialized.getAge());
            System.out.println("Deserialized student json email: " + deserialized.getEmail());
    }
}
