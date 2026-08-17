@FunctionalInterface
interface A{
    void display(String str);
}

public class LambdaFunc {
    public static void main(String[] args){
        // Without lambda function
        A obj = new A(){
            @Override
           public void display(String str){
                System.out.println("Without Lambda Function: "+str);
            }
        };

        obj.display("Melons");


                // With lambda function

        A obj2 = str -> System.out.println("With Lambda Function: "+ str);
       
        obj2.display("Hellow world!");
    }
}
