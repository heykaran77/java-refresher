class A{
    public void show(){
        System.out.println("Hi! A");
    }
}

class B extends A{
     public void show(){
        System.out.println("Hi! B");
    }
}

class C{
    
}

public class Poly {
    public static void main(String[] arhs){
        A obj = new A();
            obj.show(); // Calls A's print method


            obj = new B(); // Calls B's print method
            obj
            .show();

            // obj  = new C(); CANNOT use this because obj of type A & C does not extend A
            // obj.show();
    }

  
}
