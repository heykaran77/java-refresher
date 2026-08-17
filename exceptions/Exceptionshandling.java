package exceptions;

public class Exceptionshandling {
    public static void main(String[] args){
        int i = 10;
        int j = 5;
        String str = null;

        int nums[] = new int[5];

        try {
            int res = i/j;
            System.out.println(str.length());
            System.out.println(res);
            System.out.println(nums[1]);
            // System.out.println(nums[5]);
        } catch (ArithmeticException e) {
           System.out.println(e.getLocalizedMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }
        catch (Exception e){
            System.out.println("Something went wrong: "+e.getMessage());
        }
    }
}
