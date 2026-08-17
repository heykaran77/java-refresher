

// Suppose a class has only abstract methods and no instance variables. Such a class is known as an interface. An interface is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

interface A{

    int x = 10; // by default, this is public, static and final
    String name = "John"; // by default, this is public, static and final

    public abstract void display();
    void show(); // by default, this is public and abstract
}

class B implements A{

    public void display() {
        System.out.println("Display method in class B");
    }

    public void show() {
        System.out.println("Show method in class B");
    }
}


public class Interface {
    public static void main(String[] args){

        A obj;

        obj = new B();
        obj.display();
        obj.show();

        
        System.out.println("Value of x: " + A.x);
        System.out.println("Value of name: " + A.name);

    }
}
