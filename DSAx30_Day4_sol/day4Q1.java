package DSAx30_Day4_sol;
import java.util.Scanner;
public class day4Q1 {
     public static boolean subset(int[] nums, int k) {
        int n = nums.length;
        int total = 1 << n;
        for (int i = 0; i < total; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += nums[j];
                } }
            if (sum == k) return true;
            }
        return false;
} public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter number of elements");
        int n = a.nextInt();
        int[] nums = new int[n];
        System.out.print("enter array elements sorted");
        for (int i = 0; i < n; i++) {
            nums[i] = a.nextInt();
        }
        System.out.print("enter value u want k");
        int k = a.nextInt();
        boolean result = subset(nums, k);
        System.out.println("exist " + result);
      a.close();
    }
}
