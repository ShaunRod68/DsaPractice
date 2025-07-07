package Arrays;

public class FindAfterPivot {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 2;

        int u= nums.length-1;
        int l =0;
        while (l<=u){
            int m = (l+u)/2;
            if(nums[m]==target){
                System.out.println("Target at:"+m);
                return;
            }else if(target>nums[m]){
                l= m+1;
            } else if (target<nums[m]) {
                u = m-1;
            }
            if(l+1==u || l==u){
                System.out.println(-1);
            }

        }
    }
}
