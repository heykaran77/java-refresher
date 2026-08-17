package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        if(this.age > other.age) {
            return 1;
        } else if(this.age < other.age) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString(){
        System.out.println("Name: " + name + ", Age: " + age);
        return "";
    }
}

public class ComparableNComparator {
    public static void main(String[] args){
        List<String> words = new ArrayList<>();

        // Creating a comparator object for custom sorting logic
        Comparator<String> sortByLength = new Comparator<String>() {
            @Override

            // Sorting by increasing length of the string
            public int compare(String s1, String s2) {
                if(s1.length() > s2.length()) {
                    return 1;
                } else if(s1.length() < s2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        words.add("Hello");
        words.add("World");
        words.add("Java");
        words.add("Collections");
        words.add("DSA");
        words.add("GOA");
        words.add("Comparable");
        words.add("Comparator");
        words.add("Python");
        words.add("Abhimanyu");
        words.add("Karan");

        // Default sorting using Comparable interface
        System.out.println("Before sorting: " + words);
        Collections.sort(words);
        System.out.println("After sorting: " + words);

        // Custom sorting using Comparator interface
        Collections.sort(words, sortByLength);
        System.out.println("After sorting by length: " + words);

        List<Student> stud = new ArrayList<>();

        stud.add(new Student(22, "Kartik"));
        stud.add(new Student(20, "Ananya"));
        stud.add(new Student(25, "Rishabh"));
        stud.add(new Student(12, "Ayibs"));
        stud.add(new Student(30, "Rohit"));
        stud.add(new Student(18, "Karan"));

        // Comparator for sorting students by age
        Comparator<Student> sortByAge = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if(s1.age > s2.age) {
                    return 1;
                } else if(s1.age < s2.age) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(stud, sortByAge);
        System.out.println("After sorting students by age: ");
        for(Student s : stud){
            System.out.println(s);
        }
        Collections.sort(stud);
        System.out.println("After sorting students by age (Without using the Comparator): ");
        for(Student s : stud){
            System.out.println(s);
        }
    }
}
