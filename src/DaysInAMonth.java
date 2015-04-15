import java.util.Scanner;
public class DaysInAMonth{
  public static void main(String args []){
    
    Scanner keyboard= new Scanner(System.in);
  System.out.println("Enter month 1-12");
  int month= keyboard.nextInt();
  
//  if(month==1 || month == 3 || month==5 || month== 7 || month==8 || month==10 || month==12){
//  System.out.println(31);
//  }
//  else if(month == 4 || month== 6 || month==9 || month==11){
//    System.out.println(30);
//  }
//  else{
//  System.out.println(28);
//  }
  
  
  switch(month){
    case(1):
    case(3):
    case(5):
    case(7):
    case(8):
    case(10):
    case(12):
      System.out.println(31);
      break;
    case(2):
      System.out.println(28);
      break;
    case(4):
    case(6):
    case(9):
    case(11):
      System.out.println(30); 
      break;
    default:
      System.out.println("Not a month");
  }
  
  
  
  }



}