public class largestthree
{
    public static void main(String Args[]){
        int x = 8, y=10, z=4;

        if(x>y && x>z)
            System.out.println("x is largest: "+ x);
        else if(y>z)
            System.out.println("y is largest: "+y);
        else
            System.out.println("z is largest: "+z);
    }
}