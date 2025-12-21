import java.util.Scanner;
public class CountConsonants {
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an String :");
        String str =scan.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;

        }
    }
    System.out.println("Number of Consonants: " + count);
        }
    }

