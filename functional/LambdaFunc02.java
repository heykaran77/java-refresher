@FunctionalInterface
interface Calc{
    int add(int i, int j);
}


public class LambdaFunc02 {
    public static void main(String[] args){
            Calc obj = (i, j) -> i+j;

           System.out.println( obj.add(5, 10));
    }
}
