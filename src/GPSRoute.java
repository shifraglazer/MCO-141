import java.util.Scanner;
import java.text.DecimalFormat;

public class GPSRoute{
  public static void main(String args []){
  
    Scanner keyboard=new Scanner(System.in);
  DecimalFormat f= new DecimalFormat("##.##");
    
  System.out.println("How many segments?");
  int segments= keyboard.nextInt();
  
  double totalDistance=0;
  double time=0;
  
  for(int i=1; i<=segments;i++){
  System.out.println("Enter Segment");
  int x1=keyboard.nextInt();
  int y1=keyboard.nextInt();
  int x2=keyboard.nextInt();
  int y2=keyboard.nextInt();
  
 int mph=keyboard.nextInt();
 
 double distance=Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
// System.out.println(distance);
 time+=distance/mph;
 totalDistance+=distance;
// System.out.println(totalDistance);
  }
  System.out.println();
  System.out.println("Distance: " + f.format(totalDistance) + " miles");
  System.out.println("Time: " + f.format(time) + " hours");
  }
}