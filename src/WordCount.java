public class WordCount{
  public static void main(String args[]){

  String book= "Four score and seven yeard ago, our forfathers brought forth on this continent a new nation.";
  char array[]=book.toCharArray();
  int words=1;
  for(int i=0;i<array.length;i++){
    if(array[i]==' '){
      words++;
    }
  }
  System.out.println(words);
  }
}