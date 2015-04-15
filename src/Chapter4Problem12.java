import java.util.Scanner;
import java.io.*;
public class Chapter4Problem12{
  public static void main(String args [])throws IOException{
    
    Scanner keyboard= new Scanner(System.in);
    String fileName= "DailySales.txt";
    PrintWriter outputFile= new PrintWriter(fileName);
    double sales;
    
    for(int i=1; i<=5;i++){
      System.out.println("Enter today's sale for store " + i + ":");
      sales= keyboard.nextDouble();
      outputFile.println(sales);
    }
    
    outputFile.close();
    File file= new File(fileName);
    Scanner inputFile= new Scanner(file);
    System.out.println("SALES BAR CHART");
    
    for(int k=1; k<=5;k++){
        System.out.print("Store " + k + ":");
        double storeSales= inputFile.nextDouble();
        double stars=storeSales/100;
        for(int j=1; j<=stars; j++){
          System.out.print('*');
        }
    
      System.out.println();
    }
    inputFile.close();


    
  }
  
  
  
}