

/* 24 hour counter that counts the time by seconds
    -Variables are Hours,Minutes,Sevonds
    -Counter will be looped */
import java.util.Scanner;

public class Counter {


public void getTime(){
    int seconds = 0;
    int minutes = 0;
        minutes = seconds%60;
       while(seconds <= 59){
           seconds++;
           if(seconds == 60)
           seconds = 0;
           minutes++;
           if(minutes == 60)
           minutes = 0;
           System.out.println("Minutes = "+minutes+"\nSeconds = "+seconds);
           
           break;
         }
       }  
    }

