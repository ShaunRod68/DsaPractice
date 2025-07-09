package SortingAlgos;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3,5,1,7,8,2,12,5};
        for(int i = 0;i< nums.length-1;i++){
            int misPos = i;
            for (int j = i+1;j< nums.length;j++){
                if(nums[misPos]>nums[j]){
                    misPos=j;
                }
            }
            int temp = nums[i];
            nums[i]=nums[misPos];
            nums[misPos]=temp;
        }
        for (int n:nums){
            System.out.print(n+",");
        }
    }
}
