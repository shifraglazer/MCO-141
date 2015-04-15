public class Diamond{
  public static void main(String args []){
  
    int x=11;
    int spaces=0;
    int stars=0;
    
    
    
    for(int i=1; i<x;i+=2){
      spaces= (x-i)/2;
      stars=x-(2*spaces);
      for(int k=1;k<=spaces;k++){
        System.out.print(" ");
      }
      for(int l=1;l<=stars;l++){
        System.out.print('*');
      }
    
      System.out.println();
    }
    
    
    for(int j=x; j>0; j-=2){
      spaces= (x-j)/2;
      stars=x-(2*spaces);
      for(int k=1;k<=spaces;k++){
        System.out.print(" ");
      }
      for(int l=1;l<=stars;l++){
        System.out.print('*');
      }
      System.out.println();
      
    }
    
    
    
    
    
    
    
  }

}