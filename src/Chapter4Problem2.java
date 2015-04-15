import java.util.Scanner;
import java.text.DecimalFormat;
public class Chapter4Problem2{
  public static void main(String args[]){
  
  Scanner keyboard=new Scanner(System.in);
  DecimalFormat formatter= new DecimalFormat("##0.#");
  System.out.println("Enter speed of vehicle");
  int speed=keyboard.nextInt();
  
  System.out.println("Enter number of hours traveled");
  double hours= keyboard.nextDouble();
  
  System.out.println("Hour\tDistance Traveled");
  System.out.println("---------------------------");
  
  
  int i=1;
    double distance;
    while(i<= hours){
    distance=speed*i;
      System.out.println(i+"\t"+formatter.format(distance));
  i++;
  }
 
  }


}