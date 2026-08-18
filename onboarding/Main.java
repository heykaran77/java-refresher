import java.util.Scanner;

class Car{
    String brand, model, year;
    int currentSpeed;
    public void showDetails(String brand,String model,String year, int speed){
        this.currentSpeed = speed;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.currentSpeed = speed;

        System.out.println(brand + " | " + model + " | " + year);
    }

    public int updateSpeed(int speed){
        this.currentSpeed += speed;
        return this.currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
    
}
class Main{

public static void main(String args[]){

    Car c1 = new Car();
    Car c2 = new Car();

    c1.showDetails("Toyota", "Fortuner", "2005", 20);
    c2.showDetails("BMW", "M4", "2022", 30);

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Current Speed of c1: " + c1.getCurrentSpeed());
    System.out.println("Current Speed of c2: " + c2.getCurrentSpeed());

    char op = ' ';

  while (true) {
    System.out.println("\nChoose an option:");
    System.out.println("a. Accelerate");
    System.out.println("b. Brake");
    System.out.println("q. Quit");

    op = sc.next().charAt(0);

    switch (op) {

        case 'a' -> {
            int newSpeed = c1.getCurrentSpeed() >= 0
                    ? c1.updateSpeed(10)
                    : c1.updateSpeed(0);
            System.out.println("Current speed: " + newSpeed);
            }

        case 'b' -> {
            int brakeSpeed = c1.getCurrentSpeed() >0
                    ? c1.updateSpeed(-10)
                    : c1.updateSpeed(0);
            System.out.println("Current speed: " + brakeSpeed);
            }

        case 'q' -> {
            return;
            }

        default -> System.out.println("Invalid choice!");
    }
    
}
}}