// ther are three types of interfaces : 1.normal, 2.functional , 3.marker
/*
 We know that Functonal interface has single abstract method (SAM) so one can remove object creation [as it would be same only always] and  the method name during implementaion(in annonymous class) 
 and could straight away right the implementation[ as the method is sigle so it should refer to that method only. Therefore, Lamda is generaly one linear represented as { -> } 
 [For Ex: class_name obj = (i) -> implementation_code... ]and no need to type the parameter data-type as in abstract method it would have already been defined one time earlier and also in case of only one parameter in the abstract method no need of round brackets
 if the statement return somthing then also no need to type return keyword as it will also be same always . Note : here the anonymous class does not create a new file of class but the original class file size will increase.
 */
// the marker interface is the interface which has no methods in it and is used to communicate with compiler. 
// for Ex: on saving a game certain objects(as other data has default value on opening the game)  of game are stored(serialization) in hard disk now when game opened it will restart with zero(starting) but if one loads the game(deserialization) then some specific less occupied memory of the objects inside of hard disk are retrived. this [emission for objects which were stored on hard disk could be retrived by marker interface]
//WAP to make a lamda function such that it takes two parameters in the SAM interace and the return the Multiplication value of both

@FunctionalInterface    //annotation to communicate the compiler that we are creating a functional interface
interface Result{       // interace class conatain the property of { public abstract }  
    int add(int a, int b);  //SAM sinlge abstract method
}
public class C9_Lambda {
    public static void main(String args[]){
        int i=5, j=9;
        Result r = (a,b) -> i+j;  //when implementing the function no need to give te types of parameters passed. [it is understoood by default]
        // no need to type return it is understood by compiler.
        System.out.println("Sum of "+i+" and "+j+" is : "+r.add(i,j));
    }
}
