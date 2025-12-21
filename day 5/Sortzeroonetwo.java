public class Sortzeroonetwo {
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0,1,2};
        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }

        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
