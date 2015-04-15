import java.util.Scanner;
import java.io.*;
public class MergeFiles{
  
  public static void main(String args [])throws IOException{
    
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Enter in the name of the first file:");
    String filename1=keyboard.nextLine();
    System.out.println("Enter in the name of the second file:");
    String filename2=keyboard.nextLine();
    
    File file= new File(filename1);
    File file2= new File(filename2);
    Scanner text= new Scanner(file);
    Scanner text2=new Scanner(file2);
    
    while(text.hasNext()){
      System.out.println(text.nextLine());
      System.out.println(text2.nextLine());
    }
    text.close();
    text2.close();
  }
}