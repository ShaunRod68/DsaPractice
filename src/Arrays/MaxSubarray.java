package Arrays;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {1,-2,6,-1,3};
        int max_sub_array = Integer.MIN_VALUE;

        for (int i = 0;i<nums.length;i++){

            for (int j=i;j<nums.length;j++){
                int sum = 0;
//                System.out.print("[");
                for (int k = i;k<=j;k++){
//                    System.out.print(nums[k]);
                    sum+=nums[k];
//                    if(k!=j) System.out.print(",");
                }
//                System.out.print("]");
                if (sum>max_sub_array){
                    max_sub_array=sum;
                }
//                System.out.println("And sum is:"+sum);
            }
        }
        System.out.println("Max sub array is:"+max_sub_array);
    }
}
