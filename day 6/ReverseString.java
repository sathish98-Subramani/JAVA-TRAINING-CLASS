import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        int st=0,end=s.length()-1;
        while(st<end)
        {
            char temp=c[st];
            c[st]=c[end];
            c[end]=temp;
            st++;end--;

        }
        System.out.println(new String(c));
    }
}