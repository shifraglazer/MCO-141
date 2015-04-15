import java.util.Scanner;
public class Triangle1{
  public static void main(String args []){
    
    Scanner keyboard=new Scanner(System.in);
    
    System.out.println("How many rows in the triangle?");
    int rows=keyboard.nextInt();
    
    int total=(rows*2)-1;
    
    for(int j=1;j<rows;j++){
      for(int u=1;j<u; u++){
        System.out.print(" ");
      }
      System.out.print('*');
      for(int i=1;i<j;i++){
        System.out.print(" ");
      }
        System.out.println('*');
      
    }
      
    }
  }