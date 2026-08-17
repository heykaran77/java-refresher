package Collections;

import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args){
        String[] names = {"Karan", "Ajay", "Ravidra", "Monish", "Gandurama"};
        for(String name : names){
            System.out.println(name);
        }

        List<String> namesList = Arrays.asList(names);
        namesList.forEach(name -> System.out.println(name));
    
    }
}
    