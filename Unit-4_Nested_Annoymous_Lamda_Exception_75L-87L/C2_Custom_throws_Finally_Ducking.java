//Custom exception extends the class Exception and if one wants to display a message pass the message in the super constructor.
// throws keyword is different from throw keyword and throws a exception to higher level methods.
//A function could have throws exception words written which means that the function is not handling the exception itself rather than it is throw [Ducking] the responsibility of handling the exception to another function which has called this function.
//One should not use throws keyword with main as main function is called by JVM and if responsibilty is given to JVM then it will simply stop the execution of the code
//printStackTrace() is a method which prints all the function in heirarchy which throws the exception
//finally block is a block which gets executed after try block[if code has no exception] or after catch block if code has eception. [generally used for closing the resources]
// try block with resources is a try block which have resource objects as it paramters . theses resource objects get closed when the try block is executed.
//WAP to create hierarchy methods and throws the function and create a  user defined exception with a message and have one finnaly block statement too 

class Small extends Exception{
    public Small(String str){           //accepting a string for a message to print. Meassge would be passed at the time of object creation.
        super(str);        //no function created by user to show the message so inherit from parent(super) class             
// to make this string as the message for exception we need to call the parent constructor and pass the message as the userdefined Exception do not has the ability to output a message at the time of exception encounter and handled.
    }
}

public class C2_Custom_throws_Finally_Ducking {
    public int divide(int a, int b) throws Small{   // throws the exception to the function which has called this( divide ) function now all the responsibilty to handle the exception is with calling function.
        int d=a/b;
        if(d==0){
            // only objects of error could be thrown
            throw new Small("Denominator is too large as compared to the numerator");     
        // message to be sent is passed as actual parameter at the time object creation.     
        }
        return d;
    }

     int multiply() throws Small{  // throws exception to main method and give all resposibility of handling the exception to the main function
        int a=5,b=1000;
        divide(a,b);
        return a*b;
        
    }

    public static void main(String args[]){
        C2_Custom_throws_Finally_Ducking obj= new C2_Custom_throws_Finally_Ducking();
        try {  // By Ducking the exception , at last we are handling it in the main method.
            System.out.println("Result : "+obj.multiply());         // gives a exception of Small class
        }
        catch ( Small e) {
            System.out.println("Exception encountered with help of "+e.getClass());
            e.printStackTrace();        // prints the heirarchy of methods involved in throwinh the exceptions
        }
        finally{                        // irrespective of error encounter or not , at last this block will be executed for sure.
            System.out.println("Execution Completed."); //at last this gets executed in any case.
        }
    }
}
