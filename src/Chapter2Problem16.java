import java.util.Scanner;
public class Chapter2Problem16{
  public static void main (String [] args){
    
    Scanner keyboard= new Scanner (System.in);
    
    System.out.println("Enter a name.");
    String name= keyboard.nextLine();
    
    System.out.println("Enter an age.");
    int age = keyboard.nextInt();
    
    //to consume the remaining newline
    keyboard.nextLine();
    
    System.out.println("What is the name of a city?");
    String city = keyboard.nextLine();
    
    System.out.println("What is the name of a college?");
    String college= keyboard.nextLine();
    
    System.out.println("Name a proffesion.");
    String proffesion= keyboard.nextLine();
    
    System.out.println("Name an animal.");
    String animal= keyboard.nextLine();
    
    System.out.println("What is a pet's name?");
    String pet= keyboard.nextLine();
    
    System.out.println("There was once a person named " +
                       name + " who lived in " + city +
                       ". At the age of "+age+", " + name +
                       " went to college at " + college + ". "
                         + name + " graduated and went to work as a "+
                       proffesion + ". Then, " + name + " adopted a(n) "
                         + animal + " named " + pet +
                       ". They both lived happily ever after!");
    
    
    
  }
}