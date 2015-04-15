import java.util.Scanner;
public class ValidTriangle{
  
  public static boolean isValid(int angle1, int angle2, int angle3){
    int total=angle1+angle2+angle3;
    boolean valid=false;
    
    if(total==180){
      valid=true;
    }
    return valid;
  }
  
  public static boolean isEquilateral(int angle1, int angle2, int angle3){
    boolean equilateral=false;
    if(angle1==angle2&& angle1==angle3 && angle2==angle3){
      equilateral=true;
    }
    return equilateral;
  }
  public static boolean isIsosceles(int angle1, int angle2, int angle3){
    boolean isosceles=false;
    if(angle1==angle2 ||angle2==angle3 || angle1==angle3){
      isosceles=true;
    }
    return isosceles;
  }
  public static boolean isRight(int angle1, int angle2, int angle3){
    boolean right=false;
    if(angle1==90 || angle2==90 || angle3==90){
      right=true;
    }
    return right;
  }
  
  public static boolean isObtuse(int angle1, int angle2, int angle3){
    boolean obtuse=false;
    if(angle1>90 || angle2>90 || angle3>90){
      obtuse=true;
    }
    return obtuse;
  }
  public static void main(String args[]){
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("Enter 3 angles(integers)");
    
    int angle1=keyboard.nextInt();
    int angle2=keyboard.nextInt();
    int angle3=keyboard.nextInt();
   
    
    boolean valid=isValid(angle1, angle2, angle3);
    boolean equilateral= isEquilateral(angle1, angle2, angle3);
    boolean isosceles= isIsosceles(angle1, angle2, angle3);
    boolean right=isRight(angle1, angle2, angle3);
    boolean obtuse=isObtuse(angle1, angle2, angle3);
    
    if(valid){
      System.out.println("The triangle is valid");
      if(equilateral){
        System.out.println("The triangle is equilateral");
      }
      else{
        System.out.println("The triangle is not equilateral");
      }
      if(isosceles){
        System.out.println("The triangle is isosceles");
      }
      else{
        System.out.println("The triangle is not isosceles");
      }
      if(right){
        System.out.println("The triangle is right");
      }
      else{
        System.out.println("The triangle is not right");
      }
      if(obtuse){
        System.out.println("The triangle is obtuse");
      }
      else{
        System.out.println("The triangle is not obtuse");
      }
    }
    else{
      System.out.println("The triangle is not valid");
    }
    
    
    
  }
}
