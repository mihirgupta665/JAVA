
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Array.asList(values) could be used to add many elements in one go.
//num.forEach(n -> System.out.println(n));          n gets each values of te collection

public class F4_Consumer_forEach {
   public static void main(String args[]){
    List<Integer> arr= Arrays.asList(4,5,8,2,67,44,54);

    /* 
    Consumer<Integer> num= new Consumer<Integer>(){     //consumer is a functional interface with an accept(whihc accpets a object of wraaper class as values) as only method
    public void accept(Integer n){      // its only method take a onject as a parameter
        System.out.println(n);
    }
};
*/
    Consumer<Integer> num =  n -> System.out.println(n);
    arr.forEach(num);       
   } 
}
