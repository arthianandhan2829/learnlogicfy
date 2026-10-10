import java.util.Scanner;
import java.util.Arrays;
public class Insertion {
    public static int[] rightRotation(int arr[], int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index]= value;
        return arr;
    }
    public static int[] insert(int arr[], int index, int value) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index");
            return arr;
        }
        return rightRotation(arr, index, value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {100, 200, 300, 400, 500};
        System.out.println(arr.length);
        System.out.println("Original Array: " + Arrays.toString(arr));
        arr = insert(arr, 3, 1000);
        System.out.println(arr.length);
        System.out.println("Array after insertion: " + Arrays.toString(arr));
    }
}