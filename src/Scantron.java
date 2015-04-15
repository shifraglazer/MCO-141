import java.util.Scanner;
import java.io.*;
public class Scantron{
  public static void main (String args [])throws IOException{
  
    String answers []= new String [3];
    answers[0]="A";
    answers[1]="D";
    answers[2]="C";
    
    File file= new File("scantron1.txt");
    Scanner scantron=new Scanner(file);
    
    int numberCorrect=0;
    for(int i=0;i<answers.length;i++){
    String answer=answers[i];
    String studentAnswer= scantron.nextLine();
    if(answer.equals(studentAnswer)){
    numberCorrect++;
    }
    }
  System.out.println(numberCorrect);
  }
}