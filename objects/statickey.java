class Car{
    String brand;
    int price;

    // Static class var

   static String type;

  // Static blocks to initialize the static var when class loads (Class loads whenever an obj is created)
   static{
   type = "CARS";
    System.out.println("In static block");
}

// Constructor
public Car(){
    brand = "";
    price = 3000;
    System.out.println("In Constructor block");
   }

    public void printCar(){
        System.out.println(brand + " " + price + " " + type );
    }

    // Static meth
    public static void printCar1(Car obj){
        System.out.println("in static meth: "+obj.brand + " " + obj.price + " " + type );
    }
}

public class statickey {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand = "Mercedes";
        c1.price = 25000;

      
        Car c2 = new Car();
        c2.brand = "Toyota";
        c2.price = 10000;
        
        // Call static var using class name
        // Car.type = "SUV";
        
        c1.printCar();
        c2.printCar();
        
        // Call static meth using class name
        Car.printCar1(c2);
    }
}