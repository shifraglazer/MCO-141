import java.util.Scanner;

public class TriangleMethodsInClass {
  
  public static void printChars( String s, int n ) {
    for ( int i=1; i<=n; i++ ) {
      System.out.print(s);
    }
  }
  
  public static void printSpaces(int n) {
    printChars(" ", n);
  }
  
  public static void printLastRow(int n) {
    printChars("*", n);
  }
  
  public static void printFirstRow(int rows) {
    printSpaces(rows-1);
    
    System.out.println("*");
  }
  
  public static void printMiddleRows(int rows) {
    
    int outsideSpaces = rows-2;
    int insideSpaces = 1;
    
    // loop over each row
    for ( int i=1; i<=rows-2; i++ ) {
      
      printSpaces(outsideSpaces);
      System.out.print("*");
      printSpaces(insideSpaces);
      System.out.println("*");
      
      outsideSpaces--;
      insideSpaces+=2;
      
    }
  }
  
  //static int so can send out int
  public static int getRows(){
  System.out.println("How many rows?");
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();
    scanner.close();
    
    //send rows out so different method can recieve
    return rows;
  }
  public static void main(String[] args) {
    
    
    //need to intialized rows in the main method
    int rows=getRows();
    
    printFirstRow(rows);
    
    printMiddleRows(rows);
    
    printLastRow(rows * 2 - 1);
    
  }
  
}
