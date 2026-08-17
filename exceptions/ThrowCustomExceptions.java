package exceptions;

class NotAdultException extends Exception{
    public NotAdultException(String s){
        super(s);
    }
}

public class ThrowCustomExceptions {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new NotAdultException("Age is less than 18");
            } else {
                System.out.println("You are eligible to vote.");
            }
        
        } catch(NotAdultException e){
            System.out.println("Custom Exception: "+ e);
        }
        
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Something went wrong" + e);
        }
    }
}
