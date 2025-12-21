import java.util.Scanner;
public class Divisorofnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its divisors: ");
        int number = scanner.nextInt();

        System.out.println("Divisors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}