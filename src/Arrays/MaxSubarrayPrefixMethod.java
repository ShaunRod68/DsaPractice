package Arrays;

public class MaxSubarrayPrefixMethod {
    public static void main(String[] args) {
        int[] nums = {1,-2,6,-1,3};
        int[] prefix_array = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            if(i==0){
                prefix_array[i] = nums[i];
            }else {
                prefix_array[i] = nums[i]+prefix_array[i-1];
            }
        }
        int max_sum = Integer.MIN_VALUE;
        for (int i= 0;i<nums.length;i++){

            for (int j= i;j<nums.length;j++){
                int sum;
                if (i==0){
                    sum = prefix_array[j];
                }else {
                    sum = prefix_array[j]-prefix_array[i-1];
                }
                if (sum>max_sum){
                    max_sum=sum;
                }
            }
        }
        System.out.println("Max sum is;"+max_sum);
    }
}
