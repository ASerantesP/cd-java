package com.campusdual.exercises;

import com.campusdual.exercises.Exercise09.Doctor;
import com.campusdual.exercises.Exercise09.Person;
import com.campusdual.exercises.Exercise09.PoliceOfficer;
import com.campusdual.exercises.Exercise09.Teacher;
import java.util.Map;

public class Exercise23 {
    public static void main(String[] args) {

        customMap.put("person", new Person("John","Smith"));
        customMap.put("teacher", new Teacher("Maria","Montessori","Educación"));
        customMap.put("person", new PoliceOfficer("Jake","Peralta","B-99"));
        customMap.put("person", new Doctor("Greogry","House","Nerfoloxía e infectoloxía"));

        customMap.get("teacher").getDetails;
        customMap.remove("teacher");

        System.out.println("Contén a clave \"police\": " +customMap.containsKey("police"));
        System.out.println("Contén a clave \"teacher\": " +customMap.containsKey("police"));


    }
}
