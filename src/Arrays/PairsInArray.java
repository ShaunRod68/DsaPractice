package Arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        int len = nums.length;
        for (int i = 0;i<len;i++){
            for (int j = i+1;j<len;j++){
                System.out.print("("+nums[i]+","+nums[j]+")");
            }
            System.out.println();
        }
    }
}
