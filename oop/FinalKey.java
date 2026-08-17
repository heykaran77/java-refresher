class Hello{
    // Using final to avoid method overriding
    final public void print(){
        System.out.println("Hello! Karan");
    }

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}


// Final keyword to stop inheritance

// Error: The type Hey cannot subclass the final class Hello 
class Hey extends Hello{
    // public void print(){
    //     System.out.println("Hello! David");
    // }
}




public class FinalKey {
    public static void main(String[] atr){

        // Final on variables -  to make them constants
        final int a = 9;
        // a = 20; throws error cause A is constant

        Hey obj = new Hey();

        obj.print();
    }
    
}
