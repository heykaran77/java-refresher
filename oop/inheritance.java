public class inheritance {
    public static void main(String[] a){
       Calc c1 = new Calc();
       AdvCalc a1 = new AdvCalc();
    VAdvCalc v1 = new VAdvCalc();


    System.out.println(v1.Pow(3, 3));
    System.out.println(v1.div(60, 5));
    System.out.println(v1.sub(60, 5));
     

       System.out.println(c1.mul(3,4,5));
       System.out.println(a1.div(10, 5));
    }
    
}
