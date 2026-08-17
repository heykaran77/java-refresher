class Cal{
    public int add(int a, int b){
        return a+b;
    }
}

public class classndobj {
    public static void main(String args[]){
        Cal a = new Cal();
        int res = a.add(3, 5);

        
        System.out.println(res);
    }
}