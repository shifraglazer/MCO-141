import java.util.Scanner;
import java.io.*;
public class Chapter4Problem13{
  public static void main(String args[])throws IOException{
    
    
    //get filename
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter filename");
    String filename=keyboard.nextLine();
    
    //read file
    File f= new File(filename);
    Scanner inputFile= new Scanner(f);
    
    //print out up to file lines from file
    //put if statement in condidtional of for loop
    for(int i=1;i<=5 && inputFile.hasNext();i++){
      //read nextLine if there is next line
     
        String line=inputFile.nextLine();
        System.out.println(line);
      
      
//      if(inputFile.hasNext()){
//        String line=inputFile.nextLine();
//        System.out.println(line);.
//      }
    }
    
    
    //close file
    inputFile.close();
  }
}