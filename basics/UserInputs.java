import java.io.IOException;
import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) throws IOException{
        
        // Traditional - Not Suitable
        System.out.print("Enter initial: ");
        // Returns the ascii value of the character/ number: A -> 65
        // int num = System.in.read();
        // System.out.println(num - 48);
        
        
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf  = new BufferedReader(in);
        
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);    
        
        
        // bf.close();
        
        // Modern Way
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        System.out.println(name);
        
    }
}
