public class arrays{
    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4, 5};
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        int nums[][] = new int[3][4];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        
        for(int i =0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j]+ " ");
            }
System.out.println();
        }

        //. Enhanced for loop
        System.out.println();
        for(int n[]: nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}