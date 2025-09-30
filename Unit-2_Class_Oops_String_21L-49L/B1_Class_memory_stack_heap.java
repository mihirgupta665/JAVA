//This file tells how JVM works.
// public static void main is the first and main function to be executed. Memory for this class stored in main stack [It could constian object buts its decaration only i.e onjects reference]
// all other classes(which does not have main function) has a separted stacks for its local variable.
// varible of other class which is not a part of function is known as instance variable and is stored in heap of object memory also present in heap.
//Every object in heap has a refercence in the main stack and object in heap has two parts . 1. part is for instance variable(what it knows). 2. part is Methods (How to do ).
class Calculator{
    String str= "Calculating.....";  // stored in heap of this object in the first part.
    //instance variable
    public int add(int a, int b){    // function is stored in heap of object in second part. [But just the decalarion of the function.]
    // the cariable int a and int b is stored in the separated another satck of the member function
    // that another stacks contions the function details amd exculted when being called
        System.out.println(str);                                    
        return a+b;
    }
}
class B1_Class_memory_stack_heap{
        int data =10; // stored in main stack as a variable. asit does main class dont have object for them so no instance variable.
        // if if would have been another class then it would have stoed in heap of that object as instance variable
    public static void main(String args[]){
        Calculator calc= new Calculator();  // [new Calculator() allocates heap of memory to the object]
        // Note: calc here is an variable[not object] containing the reference to the object created through new calculator
        //calc is stored as a reference variable in the main stack
        int result= calc.add(5,12);     // also stored in the main stack.
        //calling add function through reference variable calc which at address contains the object having the function.
        System.out.println("Sum : "+result);
    }
}