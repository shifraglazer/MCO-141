import java.util.Scanner;

public class Triangle{
  public static void main(String args []){
    
    Scanner keyboard=new Scanner(System.in);
    
    System.out.println("How many rows in the triangle?");
    int rows=keyboard.nextInt();
    
    int total=(rows*2)-1;
    
    for(int j=1;j<rows;j++){
      int leadingSpaces=rows-j;
    
      //total amount of middle spaces is total- the 2 stars- leadingSpaces and -trailingSpaces
      int middleSpaces= total-2-(leadingSpaces*2);
      for(int k=1;k<=leadingSpaces;k++){
        System.out.print(' ');
      }
      
      System.out.print('*');
      for(int i=1;i<=middleSpaces;i++){
        System.out.print(' ');
      }
      if(j!=1){
        System.out.print('*');
       
      }
       System.out.println();
    }
      for(int i=1;i<=total;i++){
        System.out.print('*');
      }
      
      
    }
  }