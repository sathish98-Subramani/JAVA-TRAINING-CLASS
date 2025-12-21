import java.util.Scanner;
public class Marray {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int rowLen=a.length;
        int colLen=a[0].length;

       /* int n=5;
        int a[]=new int[n];
         */
        /*Array is an colection of similar data types
        array is an contiguous memory method */
        int row=3,col=2;
        int[] [] b=new int[row][col];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
