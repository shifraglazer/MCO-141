import java.util.Scanner;

public class DayOfWeek {
  public static void main (String args[]){
    
    Scanner keyboard= new Scanner (System.in);
    int year= 13;
    int month=0;
    int day= 8;
    
    int dayOfWeek= (day+ month+ year+ (year/4) +6) %7;
    
    if (dayOfWeek==0){
      System.out.println("sunday");
    }
    else if (dayOfWeek==1){
      System.out.println("monday");
    }
    else if (dayOfWeek==2){
      System.out.println("Tuesday");
    }
    else if (dayOfWeek==3){
      System.out.println("Wednesday");
    }
    else if (dayOfWeek==4){
      System.out.println("Thursday");
    }
    else if(dayOfWeek==5){
      System.out.println("Friday");
    }
    else {
      System.out.println("Saturday");
    }
    
    
    
    
  }
  
  
  
  
  
}