import java.util.Scanner;

public class Chapter3Problem6{
  public static void main(String args []){
    
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("Enter number of seconds");
    int seconds= keyboard.nextInt();
    
    if (seconds>= 60 && seconds < 3600){
      double minutes= seconds/60.0;
      System.out.println(minutes + " minutes");
    }
    else if (seconds>= 3600 && seconds < 86400){
      double hour= seconds/3600.0;
      System.out.println(hour + " hours");
    }
   else if (seconds>= 86400){
      double day= seconds/86400.0;
      System.out.println(day + " days");
    }
    
    
    
    
  }
  
  
  
  
}