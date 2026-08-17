package Collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsCollection {
    public static void main(String[] args){
        // Set is a collection that cannot contain duplicate elements.
        // It models the mathematical set abstraction and is a member of the Java Collections Framework.

        Set<Integer> set = new HashSet<Integer>();

        set.add(20);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(2);
        set.add(2); // Duplicate element, will not be added


// Doesnt follow the order of insertion, as it is unordered collection
        System.out.println("Set: " + set);

        // If you want to maintain the order of insertion, you can use LinkedHashSet instead of HashSet
        // Instead of Set, you can use the Collection interface to work with Set, as Set is a sub-interface of Collection & collection is sub-interface of Iterable interface.
        Set<Integer> linkedSet = new LinkedHashSet<Integer>();
        linkedSet.add(20);
        linkedSet.add(4);
        linkedSet.add(6);
        linkedSet.add(8);
        linkedSet.add(2);
        System.out.println("LinkedHashSet: " + linkedSet);

        // If you want to maintain the order of elements in a sorted manner, you can use TreeSet instead of HashSet
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(20);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(8);
        treeSet.add(2);
        System.out.println("TreeSet: " + treeSet);


        // You can use Iterator to iterate over the elements of a Set
        System.out.println("Iterating over Set using Iterator:");
        Iterator<Integer> iterator = linkedSet.iterator();
        
        while(iterator.hasNext())
            System.out.println(iterator.next());


        // The hierarchy of Iterable, Collection, and Set is as follows:
        // Iterable is the root interface of the Java Collections Framework. It defines the basic operations that can be performed on a collection of elements, such as adding, removing, and iterating over elements.
        // Collection is a sub-interface of Iterable. It represents a group of objects, known as elements. It provides additional methods for working with collections, such as size(), isEmpty(), and contains().
        // Set is a sub-interface of Collection. It represents a collection that cannot contain duplicate elements. It provides additional methods for working with sets, such as add(), remove(), and contains().
        // Various set implementations are available in the Java Collections Framework, including HashSet, LinkedHashSet, and TreeSet. Each implementation has its own characteristics and performance trade-offs.
    }
}
