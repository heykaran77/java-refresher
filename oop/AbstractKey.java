abstract class Phone{ // Abstract class

public abstract void Game();

    public void display() {
        System.out.println("This is a phone.");
    }
}

class Iphone extends Phone { // Concrete class that extends the abstract class Phone
    public void Game() {
        System.out.println("Playing a game on iPhone.");
    }
}


public class AbstractKey {
    public static void main(String[] args) {
        // Abstract class cannot be instantiated
        // AbstractKey obj = new AbstractKey(); // This will throw an error
        // Phone myPhone = new Phone();

        // However, we can create a subclass that extends the abstract class
        Phone phone = new Iphone();
        phone.display();
        phone.Game();
    }
}
