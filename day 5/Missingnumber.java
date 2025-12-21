public class Missingnumber { public static void main(String[] args) {
        int arr[] = {0, 1, 2, 4, 5};
        int n = arr.length;
        int total = n * (n +1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
