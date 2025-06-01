package DSAx30_Day4_sol;
import java.util.Scanner;
public class day4Q2 {
    public static void allsubsets(int[] nums) {
        int n = nums.length;
        int total = 1 << n;
        for (int i = 0; i < total; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(nums[j] + " ");
                }
            }
            System.out.println("]");
        }  } 
        public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter number of elements");
        int n = a.nextInt();
        int[] nums = new int[n];
        System.out.print("enter array elements sorted");
        for (int i = 0; i < n; i++) {
            nums[i] = a.nextInt();
        }
        System.out.println(" subsets ");
        allsubsets(nums);
      a.close();
    }
}
