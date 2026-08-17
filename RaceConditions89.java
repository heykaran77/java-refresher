class Counter{
    int count;

    public synchronized void increment(){
        count++;
    }
}


public class RaceConditions89{
    public static void main(String[] args){

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i=0; i<10000; i++){
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i=0; i<10000; i++){
                c.increment();
            }
        };
        

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // Different thread states:
        // New: Thread is created but not yet started.
        // Runnable: Thread is ready to run and waiting for CPU time.
        // Running: Thread is currently executing.
        // Waiting/Blocked: Thread is waiting for a resource or condition to be met.
        // Terminated: Thread has completed execution.
        // In this example, t1 and t2 will be in the Runnable state after start() is called, and they will transition to Running when the CPU schedules them. After they finish execution, they will be in the Terminated state.


        // Barrier Synchronization: Wait for both threads to finish before printing the final count
        
        try{
           t1.join();
           t2.join();
        }catch(InterruptedException e)
   {
       System.out.println("Thread interrupted: " + e.getMessage());
   }
        System.out.println("Count: " + c.count);

    }
}