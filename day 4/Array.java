import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[][] array = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int rows = array.length;
        int cols = array[0].length;

        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Taking input for a new 2D array
        Scanner scanner = new Scanner(System.in);
        int newRows = 2, newCols = 3;
        int[][] newArray = new int[newRows][newCols];

        System.out.println("Enter elements for a " + newRows + "x" + newCols + " array:");
        for (int i = 0; i < newRows; i++) {
            for (int j = 0; j < newCols; j++) {
                newArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements of the new 2D array:");
        for (int i = 0; i < newRows; i++) {
            for (int j = 0; j < newCols; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}   