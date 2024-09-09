public class diamondpatern {
 public static void main(String[] args) {
  String s1,s2;
  s1="ABCDEF";
  int len=s1.length();
  for(int i=0;i<len;i++){

    s2 = s1.substring(0,i);
    System.out.println(s2);
   }

  for(int i=len;i>0;i--){
   s2=s1.substring(0,i);
   System.out.println(s2);
  }
 }
}
