package Threads;
// Suppose A wants to inherit for a class say Z, but it also want to extend the thread class. But due to Multiple inheritance it is not possible. What we can do in this condition is since Thread class implements Runnable which is a function Interface we can solve this situation


// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<100; i++){
//             System.out.println("Hello");
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<100; i++){
//             System.out.println("Hii");
//         }
//     }
// }

public class Threads02 {

   public static void main(String[] args) {
       Runnable obj1 = () -> {
            for(int i=0;i<100; i++){
            System.out.println("Hello");
        }
    };
    Runnable obj2 =() -> {
            for(int i=0;i<100; i++){
            System.out.println("Hii");
        }
        };

    // Now you cannot use the start() cause we are no longer extending the threads class

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    
    t1.start();
    t2.start();
}
}