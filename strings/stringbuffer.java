package strings;

public class stringbuffer {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Karan");

        System.out.println(sb);
        
        sb.insert(0, "Hi! ");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        
        sb.append(" Singh Rajpurohit");
        System.out.println(sb);
        System.out.println(sb.capacity());     
    }
}