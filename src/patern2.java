public class patern2 {
    public static void main(String[] args) {
        String  s1,s2;
        int i;
        s1="ABCDEF";
        int len = s1.length();
        for(i=0;i<len;i++)
        {
            for(int j=0;j<len-1-i;j++)
            {
                System.out.print(" ");
            }
            s2=s1.substring(0,i);
            System.out.println(" "+s2);
        }
        for(i=len;i>=0;i--)
        {
            for(int j=i;j<len;j++)
            {
                System.out.print(" ");
            }
            s2=s1.substring(0,i);
            System.out.println(s2);
        }
    }
}