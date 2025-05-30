import java.util.Scanner;
public class day3Q1 {
    public static int finding(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r-l) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter number of elements");
        int n = a.nextInt();
        int[] nums = new int[n];
        System.out.print("enter array elements sorted");
        for (int i = 0; i < n; i++) {
            nums[i] = a.nextInt();
        }
        System.out.print("enter value u are targeting");
        int target = a.nextInt();
        int result = finding(nums, target);
        System.out.println("insert position is " + result);
      a.close();
    }
}

