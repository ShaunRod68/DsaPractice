package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,14,13,25,29,7};
        reverse(nums);
        for (int num : nums){
            System.out.print(num+",");
        }
    }

    private static void reverse(int[] nums) {
        int len = nums.length-1;
        int i=0;
        while (i<=len){
            int temp = nums[len];
            nums[len] = nums[i];
            nums[len] = temp;
            i++;
            len--;
        }
    }
}
