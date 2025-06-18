package DSAx30_Day8_sol;

import java.util.Scanner;

public class day8Q1 {
    public static int maxWater(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxWater = 0;
        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;
            maxWater = Math.max(maxWater, area);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
     public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter no. of elements : ");
        int n = a.nextInt();
        int[] arr = new int[n];
        System.out.println("enter heights: ");
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }
        int result = maxWater(arr);
        System.out.println("max water contained: " + result);
        a.close();
    }
}
