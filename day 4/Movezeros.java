import java.util.Scanner;
import java.util.Arrays;
public class Movezeros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int a[] =new int[size];
        for (int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<size;i++){
            if(a[i]!=0){
                a[count++]=a[i];
            }
        }
        while(count<size){
            a[count++]=0;
        }
        System.out.println(Arrays.toString(a));

    }
}
