enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Laptop{
    
    DELL(2000), HP(1500), LENOVO(1800), MACBOOK(2500);

    private int price;

    Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}


public class Enums {
    public static void main(String[] args) {
       
        System.out.println(Day.SUNDAY); // Output: SUNDAY
        System.out.println(Day.MONDAY); // Output: MONDAY


        System.out.println("Price of DELL laptop: $" + Laptop.DELL.getPrice()); // Output: Price of DELL laptop: $2000
        System.out.println("Price of HP laptop: $" + Laptop.HP.getPrice()); //
    }
}
