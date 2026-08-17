class Calc{
    public int add(int... numbers){
        int sum = 0;

        for(int n : numbers){
            sum += n;
        }

        
        return sum;
    }

    public int sub(int... numbers){
        int result = 0;

        
        for(int n : numbers){
            result-=n;
        }

      return result;
    }

  public int mul(int... numbers){
        int result = 1;

        
        for(int n : numbers){
            result*=n;
        }

      return result;
    }
}

public class inheritance {

  public static void main(String[] a){
        Calc c1 = new Calc();

        
        System.out.println(c1.mul(3,4,2));
    }
  
}