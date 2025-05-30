import java.util.Scanner;
public class day3Q2 {
    public static int removingelement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size = a.nextInt();
        int[] nums = new int[size];
        System.out.println("enter the elements of the array ");
        for (int i = 0; i < size; i++) {
            nums[i] = a.nextInt();
        }
        System.out.println("enter the value to remove ");
        int val = a.nextInt();
        int k = removingelement(nums, val);
        System.out.println("k = " + k);
        System.out.print("new array is ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        a.close();
    }
}

