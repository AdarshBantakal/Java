public class diamondpatern {
 public static void main(String[] args) {
  String s1,s2;
  s1="ABCDEF";
  for(int i=0;i<7;i++){

    s2 = s1.substring(0,i);
    System.out.println(s2);
   }

  for(int i=5;i>0;i--){
   s2=s1.substring(0,i);
   System.out.println(s2);
  }
 }
}
