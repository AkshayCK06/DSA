import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array...");
        int size = sc.nextInt();
        System.out.println("enter the values in array...");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the inputed array is ::");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        bubSort(arr, size);

    }

    private static void bubSort(int[] arr, int n) {
        System.out.println("bubbling and sorting");

        for (int i = n - 1; i >= 0; i--) {
            int swap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = 1;
                }
            }

            if (swap == 0) {
                break;
            }
        }

        System.out.println("the sorted array is ::");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
