package SortingAlgos;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3,5,1,7,8,2,12,5};
        for (int i=0;i< nums.length;i++){

            for (int j=i;j< nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]= nums[j];
                    nums[j]=temp;
                }
            }
        }
        for (int num:nums){
            System.out.print(num+",");
        }
    }
}
