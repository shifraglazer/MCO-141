import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
public class Chapter4Problem3{
  public static void main(String args[])throws IOException{
  
  Scanner keyboard=new Scanner(System.in);
  DecimalFormat formatter= new DecimalFormat("##0.#");
  System.out.println("Enter speed of vehicle");
  int speed=keyboard.nextInt();
  
  System.out.println("Enter number of hours traveled");
  double hours= keyboard.nextDouble();
  
  PrintWriter outputFile= new PrintWriter("DistanceFile.txt");
  
  outputFile.println("Hour\tDistance Traveled");
  outputFile.println("---------------------------");
  
  
  int i=1;
    double distance;
    while(i<= hours){
    distance=speed*i;
      outputFile.println(i+"\t\t"+formatter.format(distance));
  i++;
  }
 outputFile.close();
  }


}