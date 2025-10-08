// Thread is a small part of program which executes to perform cetain task.abstract 
//there are any functions like Thread.sleep, obj.setpriority(For priority: 1=minimum,5=normal,10=Highest)
//We could only suggest sheduler to give a thread a priority
//WAP to create two thread to print hi hello alternatively from different function
class A extends Thread{ // for thread one need to extend the threa class and have a run class which is called using the start function.
    public void run(){     // Every thread class has a run function which is called using start function.
        for(int i=1; i<=100; i++){
            System.out.println("HI");
            try {
                Thread.sleep(10);       //After each iteration Tread goes to sleep so that anotheer thread could be able run.
                // is a checked error which throw a InterruptedException
            } 
            catch (InterruptedException e) {
                e.printStackTrace();        // Handling the cheacked Exception
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("Elloo");
            try {
               Thread.sleep(10); 
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class E1_thread {
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj2.getPriority());
        obj1.start();       
        try {           // adding a sleep function so that we could get Hi Elloo alternatively i.e alternate threads runs
            Thread.sleep(5);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
