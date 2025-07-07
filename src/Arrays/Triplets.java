package Arrays;

public class Triplets {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.print("[");
        for (int i = 0;i<nums.length;i++){
            for (int j = 0;j< nums.length;j++){

                for (int k = 0;k< nums.length;k++){
                    if(nums[i]!=nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k] && nums[i]+nums[j]+nums[k]==0){
                        if (i!=j && j!=k && i!=k){
                            System.out.print("["+nums[i]+","+nums[j]+","+nums[k]+"]"+",");
                        }
                    }
                }
            }
        }
        System.out.print("]");
    }
}
