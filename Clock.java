import java.util.Scanner;

public class Clock {

    public static void main (String [] strArgs){

        Scanner userInput = new Scanner (System.in);
        Counter counterClass = new Counter();
         counterClass.getTime();

         //Variables that ask for time
        String Yes = "Yes";
        String yes = "yes";
        String No = "No";

        //User variable
        String strUser = "User Input";
    //Promps user
    System.out.println("Would you like to know the time?");
        strUser = userInput.next();

    //compares user answer to variables
        if ((strUser.equals(Yes)) || (strUser.equals(yes))){
            System.out.println("The time is: ");
            

        }
    }


}