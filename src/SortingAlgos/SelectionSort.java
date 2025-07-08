package SortingAlgos;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3,5,1,7,8,2,12,5};
        int cur = 0;
        int pos=0;
        for (int i = 0;i< nums.length;i++){
            int min = Integer.MAX_VALUE;
            for (int j = cur ;j< nums.length;j++){
                if (nums[j]<min){
                    pos = j;
                    min=nums[j];
                }
            }
            int temp = nums[cur];
            nums[cur] = nums[pos];
            nums[pos] = temp;
            cur++;
        }
        for (int n:nums){
            System.out.print(n+",");
        }
    }
}
