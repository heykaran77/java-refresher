package strings;

public class string {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + " Karan";


        // Two strings point/ refer to the same adderss
        String s1 = "Karan";
        String s2 = "Karan";
        System.out.println(s1 == s2);
        System.out.println(str);
    }
}