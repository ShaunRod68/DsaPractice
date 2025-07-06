package Arrays;

public class SubArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,14,2,13,25,29,7};
        int len = nums.length;
        int total = 0;
        for (int i = 0;i<len;i++){

            for (int j = i;j<len;j++){
                int sum = 0;
                System.out.print("[");
                for (int k = i;k<=j;k++){
                    System.out.print(nums[k]);
                    total++;
                    sum+=nums[k];
                    if (k < j) System.out.print(",");
                }
                System.out.print("]");
                System.out.print(" And Sum="+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total is :"+total);
    }
}
