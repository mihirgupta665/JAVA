//System.out.println here println is a method of print stream class and out is the object to call println method but out is the Static object of the System class
// Data could be taken as input from the BufferedReader class's object but the BufferedReader need an object of InputStreamReader which also need a object of InputStream[System.in here in is the object of Input Stream].
//BufferReader is a resource and we need to close it.
//WAP to take a input integer as String then convert it into int type and then print the number. [Without using the Scanner class]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// as these are not the part of default package of java.lang.*
public class C3_Input_Buffer_Reader {
    public static void main(String args[]) throws IOException{  //read function could cause a IOexception [Checked Error]
        InputStreamReader isr = new InputStreamReader(System.in); // InputStreamReader allow BufferReader to read a value but in constructor needs a object of InputStream class
        BufferedReader bf = new BufferedReader(isr); //bufferedReader has the ability to read values but need in constructor need a object of InputStreamReader.
        System.out.print("Enter a number : ");
        int num=Integer.parseInt(bf.readLine()); // readLine reads a number but of string type. After each read function cursor move to new line .
        //parseInt:  converts the input string to Integer type and then the value is stored in the primitve int through auto-unboxing.
        System.out.println("The number is : "+num);
        bf.close(); // bufferedreader is a resourse so need to be close to avoid misuse or leakage.

    }
}
