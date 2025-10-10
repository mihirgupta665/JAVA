//Comparator is a interface whose object is passes during sorting to apply a cateria to sort. While creation of custom logic the compare method of comparator need to return 1 ro swap or retun -1 to not to sawp
// comparator is used to specifically compare the values on basis of the object of comparator class. Lambda function and object is created performing the specific comparision.
// comparator creates a object to specify on which logic the sortimg need to be done
// comparable of to give the authority to class and its objects to compare themselves then comparable is used. it has a function comapareTo which is used to compare both the objects

//WAP to sort a List

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student implements Comparable<Student>{
    // just changing the function of nnatural sorting(which does not contain any compartor object)
    @Override
    public int compareTo(Student that){     // naturally comparing them through comareTO
        if(this.roll > that.roll) return 1;
        else if(this.roll == that.roll) return 0;
        else return -1;
    }
    int roll;
    String name;
    public Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    @Override
    public String toString(){
        return "Roll no is : "+roll+" has name : "+name;
    }
}
public class F5_Comparator {
    public static void main(String[] args){
        //Comparator genereters a comparator object which has the specific logic to sort the data
        Comparator<Student> com= (i,j) -> i.roll%10 > j.roll%10? 1 :  -1 ;    // using comparator to compare the last digit of rolls number to sort
        // the single abstract method is compare and it take two any same data type variables to compare.
                // comparator is a functional interface which compares the values and sort accordingly but not a part of collections so Type Wrapper Integer or another class must be specified in both the sides
        List<Student> nums= new ArrayList<>();  // as it is a part of collection so no need to right Intger type in right side also.
        nums.add(new Student(12,"Mihir_1"));       // collection only works with objects.
        nums.add(new Student(56,"Mihir_2"));
        nums.add(new Student(40,"Mihir_3"));
        nums.add(new Student(25,"Mihir-4"));
        for(Student i : nums){  // just printing the nums
            System.out.println(i);
        }
        System.out.println();
        Collections.sort(nums, com);    
        for(Student i : nums){          // printhing the nums throught a specific logic with help of specific caparator object.
            System.out.println(i);
        }
        System.out.println();
        Collections.sort(nums);
        for(Student i : nums){       //Comparing the nums through comparable which is the natural sort( but with overriding sort) without any specific object(conatining the logic) to compare.        
            System.out.println(i);
        }   
    }
}

