//logical  operator in && if any first condition is false it will not check the other condtions. Similarly is in || if first any condition is true it will not check other condtion
//Switch case ->( instead of colon : ) arrow the updated one has in built break. (->  can also be written as " : yield ". 
//Switch can be a expression now. starting with a variable to store the returned value and ending with semicolon ; 
//WAP to print the wake up time of different days of week using updated switch.

class A3_Switch_updated{            // as my class name is same as file name . Therfore, no need to use javac file_name.java and java class_name. we can run in this case directly.
    public static void main(String args[]){
        String day="Wednesday";
        String ans= switch(day){        //Updated switch in java could return a value and can actas expression ending with semicolon
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Wake up at 7am.";  //-> arrow means to break after case execution if case matches.
            case "Saturday", "Sunday" -> "Wake up at 9am.";  //updated switch can match different case together
            default -> "Enter Valid Day.";
        };      // as we are making it a expression so semicolon is complusory.
        System.out.println(ans);
    }
}