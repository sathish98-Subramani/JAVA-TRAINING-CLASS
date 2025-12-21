public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b=1;
        int n=6;
        System.out.println(a+" "+b+" ");
        for(int i=1;i<=n;i++){
            int c = a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
    
}