import java.util.Scanner;

public class Chapter3Problem11{
  public static void main(String args []){
  
Scanner keyboard= new Scanner(System.in);

System.out.println("Enter the name of runner 1"); 
String runner1= keyboard.nextLine();

System.out.println("Enter minutes it took to finish the race");
int time1=keyboard.nextInt();


System.out.println("Enter the name of runner 2");

keyboard.nextLine();
String runner2= keyboard.nextLine();


System.out.println("Enter minutes it took to finish the race");
int time2=keyboard.nextInt();

System.out.println("Enter the name of runner 3");
keyboard.nextLine();
String runner3= keyboard.nextLine();



System.out.println("Enter minutes it took to finish the race");
int time3=keyboard.nextInt();

if(time1 < time2 && time1 < time3){
  System.out.println(runner1);
  if (time2 < time3){
    System.out.println(runner2);
    System.out.println(runner3);
  }
  else {
    System.out.println(runner3);
    System.out.println(runner2);
  }
}

else if(time2 < time1 && time2 < time3){
  System.out.println(runner2);
  if(time1 < time3){
    System.out.println(runner1);
    System.out.println(runner3);
  }
  else{
    System.out.println(runner3);
    System.out.println(runner1);
  }
}

else if (time3 < time1 && time3 < time2){
  System.out.println(runner3);
  if(time1 < time2){
    System.out.println(runner1);
    System.out.println(runner2);
  }
  else{
    System.out.println(runner2);
    System.out.println(runner1);
  }
}

  }

}