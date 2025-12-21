public class Swapwithvariable {
    public static void main(String[] args) {
        int a=20;int b=30;
        /*System.out.println(a +" "+ b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a +" "+ b); */

         //Without third variable
        a=a+b;
        b=a-b;
        a=a-b;

    }
}