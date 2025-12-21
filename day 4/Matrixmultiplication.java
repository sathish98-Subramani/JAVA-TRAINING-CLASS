import java.util.Arrays;
public class Matrixmultiplication {
    public static void main(String[] args) {
    int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
    int[][] b = { { 1, 2 }, { 3, 3 }, { 4, 4 } };
    int m = a.length;
    int n = a[0].length;
    int p = b[0].length;
    if(n != b.length) {
        System.out.println("Not possible");
    } else {
        int result[][] = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
}
}