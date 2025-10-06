//Runtime errors are called as Exception and handling such eception is referred to Exception Handling.
/*
 Try block basicaaly try to execultes the inside critical statments, if executed then all good 
 otherwise try block throws an Exception as a Object and that exceptio object is received by Catch block which implements other instruction to handle the exception.
 When the exception arrises in the try block from that particular statement programs moves to catch block so no statement below that try block statmente gets executed if exception arise.
 Every try has its own immediately following catch block
 */
//If one want to throw a exception to hadle certain situation then a throw keyword is used to throw an object of exception to the catch block [ For Ex: throw new ArithmeticException("msgs") ]. Therefore,  Throws calls the catch block with a message passed in the object constructor.
//WAP to print any two error and one error message  
public class C1_Exception_try_catch {
    public static void main(String args[]){
        int a=10;
        int b=0;
        int arr[]= new int[5];
        try {           // try to execute critical statements . it fails to run then try block throws a object of error to catch block 
            float d= a/b;    //diving by 0
        }
        catch (ArithmeticException e) {        // cathces the arithmetic error like divide by zero
            System.out.println(a+"Error of diving by zero : "+e);
        }
        try {
            System.out.println(arr[5]);
        } 
        catch(ArrayIndexOutOfBoundsException e){        // catches the the error which are out of bounds(limits)
            System.out.println("Be in the array limits : "+e);
        }
        try {
            int z=100;
            a=10;
            int d=a/z;
            if(d==0){
                throw new ArithmeticException("Numerator is less then denominator.");  //printing the meassage after printing the error object 
            }
        } 
        catch (ArithmeticException e) {        // cathces the arithmetic error like divide by zero
            System.out.println(a+" "+e+" So, Please do rectification");
        }
        catch(Exception e){     // General exception is the parent super class of all the exception classes so need to be written at last otherwise other exception class object will become unreachable.
            System.out.println("Something went wrong"); //General exeception to handle a non expected exception
        }
    }
}
