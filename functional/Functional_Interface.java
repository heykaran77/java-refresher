// An Interface having only one abstract method is known as a functional interface. A functional interface can have any number of default methods, static methods, and private methods, but it can have only one abstract method.

@FunctionalInterface
interface MyFunctionalInterface {
    int add(int a, int b);
    
    // Default method
    default void display() {
        System.out.println("This is a default method in the functional interface.");
    }
}

public class Functional_Interface {
   public static void main(String[] args) {
       MyFunctionalInterface obj = new MyFunctionalInterface() { // Anonymous object implementing the functional interface
              @Override
                public int add(int a, int b) {
                 return a + b;
                }
          };
    
          int result = obj.add(5, 10);
          System.out.println("Result: " + result); // Output: Result: 15
          obj.display(); // Output: This is a default method in the functional interface.
       }
    }