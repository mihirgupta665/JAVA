//string is a class and we can use member function with (.) operator. [For ex: charAt]
//String name= "mihir" in behind it will make an object  [Behind the scene : String name = new String("Mihir");]
//If String S1="Mihir" and S2="Mihir" {are not two differen object but two different references} then these two are references for the same object.[So, there address would be same.]
//String are immutable . If str="Mihir" and we then do str = str + " Gupta" then the reference will be changed i.e. the adddress of str will change and will point to new memory location containing "Mihir Gupta". and the initial refernece "Mihir would be cosidered as a garbage and will be removed to save space later on."
//String Buffer has a defult capacity of 16. ifi add "mihir" to it then its capacity increses from 16 to 21. [its is containing more 16 sapace so that in future if one add data then continuous memory is available for addition , i.e. there should be a reallocation everytime]
//leght is for data and capacity is for the allocated memory spaces.
//WAP to write a immutable string change the refernce by aading some data. then create a mutable string

class B3_string_buffer{
    public static void main(String args[]){
        String name= new String("Mihir");  // name is a refernce not a object of class string
        System.out.println(name);
        name= name+ " Gupta";      
        // the references gets changed and the old string "mihir" becomes a garbage value and will be removed later on.
        System.out.println(name);   
        StringBuffer str= new StringBuffer("Hello");  // here string becomes mutable and value is changed at the same reference.
        str.append(" World!!!");
        str.insert(0,"Hii ");
        str.deleteCharAt(2);
        str.toString();             //makes it immutable.
        System.out.println(str);
    }
}