public class SortStrings{
public static void main(String args []){



String a= "hello";
String b= "goodbye";
String c="wake up";

String temp;

if(b.compareTo(a)< 0){
  temp=a;
  a=b;
  b=temp;
}
if(c.compareTo(b)< 0){
  temp=b;
  b=c;
  c=temp;
}
if(b.compareTo(a)< 0){
  temp=a;
  a=b;
  b=temp;
}

System.out.println(a + " "+ b+ " "+c);

//if(a.compareTo(b) == 0){
//  System.out.println("Strings are equal");
//}
//else if (a.compareTo(b) > 0){
//  System.out.println(b + " " + a);
//}
//else if (a.compareTo(b) < 0){
//  System.out.println(a+ " " + b);
//}
//



}

}