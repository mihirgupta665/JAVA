//join is used so that one thread could complete its intire task and then join to the main thread. till then the super thread needs wait to execute another satatemnet of its.
//syncronization ensures that mutation to do not take place that is if one thread is operating a elemen then same element should be accessed by any another thread.
/*
States of thread: 1. New : when new thread is created. 2. Runnable when thread is ready for execution and sheduler is  the way to shedule it to CPU.
3. Running: When the thread is executing its task. 4. waiting:  when a thhread wait or sleep, it must notify to come back and then it get moved to runnable  state againi
5. Dead: when a thread stop it execution (dead is deprecated now).
*/
//WAP to create a race condtion by incrementing c a private varaible of counter class  and use .join to make the tread execute together

class Counter{
    int count;          // by default int value starts from 0.
    public  synchronized void  increment(){     //synchronization makes the thread work with shared variable only when no thread is using the variable.
        //if synchronized is not written then c value which must be 2000 would not be 2000 as there might many times may have happened that the same value of c was accessed by more then one thread and manipulated also at the same vlaue due to which net increase to the sahred entity was not sufficient.

        count++;
    }
}

class E3_Race_condition_join_sync{
    public static void main(String args[]) throws InterruptedException{
        Counter c= new Counter();       // making  a object of sharred class to access shared entity
        Runnable obj1= () -> {      // here () this is the parameter of the single method of the funtional interface
            for(int i=1;i<=1000;i++){
                c.increment();
            }
        };

        Runnable obj2= () -> {      // here () this is the parameter of the single method of the funtional interface
            for(int i=1;i<=1000;i++){
                c.increment();
            }
        };

        Thread t1= new Thread(obj1);         //Thread class cound have  object in its constructor
        Thread t2= new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();              // .join : method is used to make the bit thread execute together at the same time.
        t2.join();
        System.out.println(c.count);  
        
    }
}