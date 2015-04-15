import java.util.Scanner;
import java.io.*;

public class Chapter4Problem14{
  public static void main(String args [])throws IOException{
    
    //get filename
    System.out.println("Enter filename");
    Scanner keyboard=new Scanner(System.in);
    String filename=keyboard.nextLine();
    
    //open file to read
    File file= new File(filename);
    Scanner inputFile= new Scanner(file);
    
    //read lines
    for(int i=1;inputFile.hasNext();i++){
      System.out.print(i + ": ");
      System.out.println(inputFile.nextLine());
    }
    inputFile.close();
  }
}