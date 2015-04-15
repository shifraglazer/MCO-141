import java.util.Scanner;

public class AirportRadar{
  public static void main(String args[]){
    
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("Enter x1");
    int x1= keyboard.nextInt();
    
    System.out.println("Enter y1");
    int y1= keyboard.nextInt();
    
    System.out.println("Enter x2");
    int x2= keyboard.nextInt();
    
    System.out.println("Enter y2");
    int y2= keyboard.nextInt();
   
    
   int distance= ((y2- y1) * (y2- y1))/ ((x2- x1) * (x2- x1));
   
   if (0 <= distance && distance <= 1){
   System.out.println("Plane has landed");
   }
   else if (2 <= distance && distance <= 10){
   System.out.println("Plane is on final approach");
   }
   else if (11 <= distance && distance <= 100){
     System.out.println("Plane is getting close");
   }
   else {
     System.out.println("Plane is very far away");
   }
  
  
  
  }




}