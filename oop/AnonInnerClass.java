class Phone {
    public void display() {
        System.out.println("This is a phone.");
    }

    class InnerPhone {
        public void innerDisplay() {
            System.out.println("This is an inner phone.");
        }
    }
}


public class AnonInnerClass {
    public static void main(String[] args) {
        // Creating an anonymous inner class that extends the abstract class Phone
        Phone myPhone = new Phone() {
           public void display() {
                System.out.println("Anonymous phone displayed.");
            }
        };

        // Calling the display method of the inner phone class
        Phone.InnerPhone innerphone = myPhone.new InnerPhone();
        innerphone.innerDisplay();

        myPhone.display();
    }
}
