import java.util.Scanner;
public class TaxiDispatch{
  public static void main(String args[]){
  
  Scanner keyboard= new Scanner(System.in);
  
  System.out.println("Enter point x");
  double x1= keyboard.nextDouble();
  
  System.out.println("Enter point y");
   double y1= keyboard.nextDouble();
   
   int x2= 0;
   int y2= 3;
   double distancePointOne= Math.sqrt(((x2 - x1)* (x2 - x1))+ ((y2-y1)* (y2-y1)));
   
   x2=10;
   y2=8;                                   
   double distancePointTwo= Math.sqrt(((x2 - x1)* (x2 - x1))+ ((y2-y1)* (y2-y1)));      
   
  
   
   if(distancePointOne < distancePointTwo )  {
     System.out.println("Taxi A (0,3) is closest");
   }   
   
   else {
     System.out.println("Taxi B (10,8) is closest");   
   } 
  
   
   
   
   
  }
  
  
  
}