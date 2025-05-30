import java.util.Scanner;
public class day2Q2 {
    public static void rotate(int[] arr) {
        int n = arr.length;
        if (n <= 1) return; 
        int last = arr[n - 1]; 
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last; 
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter number of elements:");
        int n = a.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }
        rotate(arr);
        System.out.println("array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        a.close();
    }
}

