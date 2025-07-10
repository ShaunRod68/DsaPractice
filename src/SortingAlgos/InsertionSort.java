package SortingAlgos;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3,5,1,7,8,2,12,5};
        for (int i =1;i< nums.length;i++){
            int curr = nums[i];
            int prev = i-1;
            while (prev>=0 && nums[prev]>curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;
        }
        for (int n:nums){
            System.out.print(n+",");
        }
    }
}
