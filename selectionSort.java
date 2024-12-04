import java.util.Scanner;

public class selectionSort {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array...");
        int size = sc.nextInt();
        System.out.println("enter the values in array...");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("the inputed array is ::");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        selectSort(arr);
    }


    private static void selectSort(int[] arr){
        System.out.println("selection sorting");
        
        for (int i = 0; i < arr.length; i++) {
            int minLoc= i;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[j]<arr[minLoc]) {
                    minLoc = j;
                }
            }

            int temp = arr[i];
            arr[i]= arr[minLoc];
            arr[minLoc]= temp;
        }

        System.out.println("the sorted array is ::");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
