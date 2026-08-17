package exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyExc {
    public static void main(String args[]) throws IOException{
        int i =5;
        int j = 0;
        BufferedReader br = null;

        try {
          InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            System.out.println("Enter your name: ");
            String name =   br.readLine();
            System.out.println(name);
        } catch (ArithmeticException e) {
            System.out.println("Error occured: "+e);
        } catch (Exception e){
            System.out.println("Something went wrong: "+e);
        } finally{
            System.out.println("Closing all resources...");
            br.close();
        }
    }
}
