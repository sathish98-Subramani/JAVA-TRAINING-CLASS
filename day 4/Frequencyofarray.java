public class Frequencyofarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        int n = arr.length;
        int currentElement = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == currentElement) {
                count++;
            } else {
                System.out.println("Element: " + currentElement + ", Frequency: " + count);
                currentElement = arr[i];
                count = 1;
            }
        }
        System.out.println("Element: " + currentElement + ", Frequency: " + count);
    }
}