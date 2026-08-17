package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListC {
    public static void main(String[] args){
        Collection<Integer> c = new ArrayList<Integer>();

        //if you want to work with index values, you can use List class instead of Collection interface
        List<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(20);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(2);

        // Accessing elements using index
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        
        c.add(20);
        c.add(4);
        c.add(6);
        c.add(8);
        c.add(2);
        
        // System.out.println("Array List: " + c);



        // Extended ForLoop
        for(int n : c){
            System.out.println(n);
        }
    }
}
