// Runnable is a functional interface and could be made a la,bda function
//In lambda class the class is used only once 
// during implementation using labda function we could directly define run function in th lambda function of runnable.
//As runnable function do not have tsart method (or any method o fThreads). Therefore create Threads and pass the object of the implemented class in the constructor of the tread. Then the new object of Thread will have the ability to to perform Thread Function
//WAP to make a thread using Runnable functional interface

public class E2_runnable_lambda {
    public static void main(String args[]){
        Runnable obj1= () -> {  //First Lambda Function of the functional interface Runnable
            for(int i=0;i<100;i++){
                System.out.println("HI");
                try {       // as we need to print in alternate Thread so need to sleep thread after each printing
                    Thread.sleep(10);
                } 
                catch (InterruptedException e) {    // the sleep method is a checked exception so need to be handled as after sleep it will come back to sheduler so interrupion sshould be handled
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2= () -> {      // this all define the run method of Functional interface Runnable through creation of anonymous class
            // Java does generate a class internally at runtime but not a file of .class
            for(int i=0;i<100;i++){
                System.out.println("Elloo");
                try {
                    Thread.sleep(10);
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1= new Thread(obj1);        //As through Runnable and its annoymous class we are unable to use Thread methods
        Thread t2= new Thread(obj2);        // For starting a Thread one need start method of Thread class.
        //So thread objects are created so that Thread Functioncould be applied and for defining the functionality (what to do) objects of Runaable Functional Interface are passed in the constructor of the Thread (to inforce thread objects the ability to execute the functionality of Runnable annonymous class)
        t1.start();
        try {
            Thread.sleep(2);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
        
