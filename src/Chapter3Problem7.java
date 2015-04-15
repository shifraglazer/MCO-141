import java.util.Scanner;

public class Chapter3Problem7{
  public static void main(String args []){
  
  Scanner keyboard=new Scanner(System.in);
  
  System.out.println("Enter name 1");
  String name1=keyboard.nextLine();
  
    System.out.println("Enter name 2");
  String name2=keyboard.nextLine();
  
    System.out.println("Enter name 3");
  String name3=keyboard.nextLine();
  
 String temp;
  if(name2.compareToIgnoreCase(name1)<0){
    temp=name1;
    name1=name2;
    name2=temp;
  }
  
  if(name3.compareToIgnoreCase(name2)<0){
  temp=name2;
  name2=name3;
  name3=temp;
  }
  
   if(name2.compareToIgnoreCase(name1)<0){
    temp=name1;
    name1=name2;
    name2=temp;
  }
   else{
   System.out.println("Error, invalid input");
   }
   System.out.println(name1 + "\n" + name2 + "\n" + name3);
  }

}