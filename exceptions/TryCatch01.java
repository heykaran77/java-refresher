package exceptions;

public class TryCatch01 {
    public static void main(String[] args){
        int i = 0;
        int j = 10;

        try {
            int div = j/i;
        } catch (Exception e) {
            System.out.println("Something went wrong "+e.getMessage());
        }
    }
}
