public class VAdvCalc extends AdvCalc  {
    public int Pow(int a, int b){
        return (int)Math.pow(a, b);
    }

    @Override
     public int sub(int... numbers){
        int result = 0;

        for(int n : numbers){
            result-=n;
        }

        return result;
    }
}
