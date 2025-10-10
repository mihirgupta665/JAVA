
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class F6_stream {
    public static void main(String args[]){
        List<Integer> arr= Arrays.asList(4,7,12,45,76,13,89);       // creating tohgere a list as n array
        Stream<Integer> s1= arr.stream();       // creating a stream with List object variables
        Stream<Integer> s2= s1.filter(n -> n%2==0);
        Stream<Integer> s3= s2.map(n -> n*2);
        s3.forEach(n -> System.out.println(n)); //takes all n and does or perform the opration
        // int result= s3.reduce(0, (c,e) -> c+e);     //reduce result in sum and single integer so need to be stored in int value no array or wrapper class
        // System.out.println(result);

        int R= arr.stream()
           .filter(n-> n%2==0)
           .map(n -> n*2)
           .reduce(0, (c,e) -> c+e);
        System.out.println(R);

    }
}
