import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Metrocard{
  public static void main(String args []) throws IOException{
    
    Scanner keyboard=new Scanner(System.in);
    DecimalFormat f= new DecimalFormat("$#,##0.00");
    DecimalFormat n= new DecimalFormat("##.##");
    
    System.out.println("Enter the name of the file?");
    String filename= keyboard.nextLine();
    
    Scanner inputFile= new Scanner ( new File(filename));
    double money=inputFile.nextDouble();
    
    inputFile.close();
    
    System.out.println("Amount of money on card: " + f.format(money));
    
    int add=30;
    
    while(add !=0 && add!= 10 && add!=20 && add!=50){
      System.out.println("How much would you like to add (0,10,20,50)?");
      add=keyboard.nextInt();
    }
    
    PrintWriter outputFile= new PrintWriter(filename);
    
    double onCard= money+ add;
    System.out.println("Amount of money on card: " +f.format(onCard));
    outputFile.println(n.format(onCard));
    
    outputFile.close();
  }
  
}