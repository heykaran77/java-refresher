package Collections;

import java.util.HashMap;
import java.util.Map;

// Use hashmap to store the student name and marks. Then print the hashmap and also print the name and marks of each student using for loop. While working with threads explicitly use synchronization to avoid concurrent modification exception. However, HashTable is synchronized by default.

public class MapsJava {
    public static void main(String[] args){
        Map<String, Integer> students = new HashMap<>();

        students.put("Karan", 98);
        students.put("Ajay", 43);
        students.put("Ravidra", 56);
        students.put("Monish", 54);
        students.put("Gandurama", 69);


        System.out.println(students);
        
        for(String name : students.keySet()){
            System.out.println(name + " " + students.get(name));
        }
    }
}
