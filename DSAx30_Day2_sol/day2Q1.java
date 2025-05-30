import java.util.Scanner;

public class day2Q1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter number of elements:");
        int n = a.nextInt();
        int[] nums = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = a.nextInt();
        }
        System.out.print("enter the target:");
        int target = a.nextInt();
        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("indices found at" + result[0] + "," + result[1]);
            System.out.println("numbers are " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("no such pair found");
        }
        a.close();
    }
}
