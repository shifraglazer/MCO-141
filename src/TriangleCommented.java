import java.util.Scanner;

public class TriangleCommented{
  
  public static void printSpaces(int n){
    for(int i=1; i<=n; i++){
    System.out.print(" ");
    }
  }
  public static void main(String args []){
    
    Scanner keyboard=new Scanner(System.in);
    
    System.out.println("How many rows in the triangle?");
    int rows=keyboard.nextInt();
    keyboard.close();
    
    printSpaces(rows-1);
    for(int j=1;j<rows;j++){
      int leadingSpaces=rows-2;
    
      //total amount of middle spaces is total- the 2 stars- leadingSpaces and -trailingSpaces
      int middleSpaces= 1;
      printSpaces(leadingSpaces);
      
      System.out.print('*');
      printSpaces(middleSpaces);
      
      leadingSpaces --;
      middleSpaces+=2;
       System.out.println();
    }
      for(int i=1;i<=rows*2-1;i++){
        System.out.print('*');
      }
      
      
    }
  }