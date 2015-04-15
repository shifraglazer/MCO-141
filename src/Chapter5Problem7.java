import java.util.Scanner;

public class Chapter5Problem7{
  
//  public static double getScore(){
//    
//     Scanner keyboard= new Scanner(System.in);
//  System.out.println("Enter 5 test scores");
//   double score1=keyboard.nextInt();
//   double score2=keyboard.nextInt();
//    double score3=keyboard.nextInt();
//    double score4=keyboard.nextInt();
//    double score5=keyboard.nextInt();
//    return score1,score2,score3,score4,score5;
//  }
//  
//  public static double toScore(double testGrade){
//    double score=testGrade;
//    return score;
//  }
  public static void printGrade( char grade, double score){
    System.out.println(score +"\t" + grade);
  }
  public static char determineGrade(double score){
    
    
    char grade='E';
    if(score>=90 && score<=100){
      grade='A';
    }
    else if(score>=80 && score<=89){
      grade='B';
    }
    else if(score>=70 && score<=79){
      grade='C';
    }
    else if(score>=60 && score<=69){
      grade='D';
    }
    else if(score<60){
      grade='F';
    }
    
    return grade;
    
    
  }
  public static double calcAverage(double score1, double score2, double score3,double score4, double score5){
    double average=(score1+score2+score3+score4+score5)/5.0;
    return average;
  }
  
  
  public static void main(String args []){
    
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Enter 5 test scores");
    double score1=keyboard.nextInt();
    double score2=keyboard.nextInt();
    double score3=keyboard.nextInt();
    double score4=keyboard.nextInt();
    double score5=keyboard.nextInt();
    
    
    System.out.println("Score\tLetter Grade");
    System.out.println("______________________");
    
    double score= score1;
    char grade=determineGrade(score1);
    printGrade(grade,score);
    
    score= score2;
    grade=determineGrade(score2);
    printGrade(grade, score);
    
    score= score3;
    grade=determineGrade(score3);
    printGrade(grade, score);
    
    score= score4;
    grade=determineGrade(score4);
    printGrade(grade, score);
    
    score= score5;
    grade=determineGrade(score5);
    printGrade(grade, score);
    
    //average grade
    score=calcAverage(score1,score2,score3,score4,score5);
    grade=determineGrade(score);
    printGrade(grade, score);
  }
  
}