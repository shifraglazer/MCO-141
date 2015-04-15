public class DiamondCommented{
  public static void main(String args []){
  
    int x=11;
    int spaces=0;
    int stars=0;
    
    // construct top half of diamond
    // do one row at a time
    for(int i=1; i<x; i+=2){
      
      // determine number of spaces and stars for row
      spaces= (x-i)/2;
      stars=i;//x-(2*spaces);
      
      // print initial space on each row
      for(int k=1;k<=spaces;k++){
        System.out.print(' ');
      }
      
      // print number of stars for this row
      for(int l=1;l<=stars;l++){
        System.out.print('*');
      }
      
      // print trailing spaces(do not need)
//      for(int m=1;m<=spaces;m++){
//        System.out.print(' ');
//      }
      
      // go to the next line
      System.out.println();
    }
    
    // do the bottom half of the diamond
    for(int j=x; j>0; j-=2){
      
      // determine number of stars and spaces for each row
      spaces= (x-j)/2;
      stars=j;//x-(2*spaces);
      
      // print the initial spaces for the row
      for(int k=1;k<=spaces;k++){
        System.out.print(' ');
      }
      
      // print the stars for that row
      for(int l=1;l<=stars;l++){
        System.out.print('*');
      }
      
      // print trailing spaces for the row(don't need)
//      for(int m=1;m<=spaces;m++){
//        System.out.print(' ');
//      }
      
      // go to the next line
      System.out.println();
      
    }
  }

}