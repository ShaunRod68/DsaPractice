package Arrays;

public class DuplicateCheck {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        for (int i = 0;i<nums.length;i++){

            for(int j=i+1;j< nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println("Duplicate in Array");
                    return;
                }

            }
            if(i== nums.length-1){
                System.out.println("Unique Array");
            }
        }
    }
}
