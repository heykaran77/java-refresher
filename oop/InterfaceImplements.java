interface A{
    int x = 10; // by default, this is public, static and final
    String name = "John"; // by default, this is public, static and final

    public abstract void display();
    void show(); // by default, this is public and abstract
}

interface B{
    int get();
}

interface D extends B{

}

class C implements B, A{
    public void display(){
        System.out.println("Display method implemented in class C");
    }

    public void show(){
        System.out.println("Show method implemented in class C");
    }
    

    public int get() {
        return x; // accessing the static variable x from interface A
    }
}

public class InterfaceImplements {
    public static void main(String[] args) {
        A obj;

        obj = new C();
        obj.display();
        obj.show();

        B objB = new C();
        objB.get(); // This line will cause a compilation error because obj is of type A, which does not have the get() method.

        System.out.println("Value of x: " + A.x);
        System.out.println("Value of name: " + A.name);
    }
}