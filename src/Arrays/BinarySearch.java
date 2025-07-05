package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {3, 5, 9, 12};
        int key = 7;
        int u = nums.length-1;
        int l = 0;
        while (l<=u){
            int m = (u+l)/2;
            System.out.println("l:"+l+"u:"+u+"m:"+m);
            if(nums[m]==key){
                System.out.println("Key at "+m);
                break;
            }else if(key>nums[m]){
//                System.out.println("low"+m);
                l = m+1;
            }else if(key<nums[m]){
//                System.out.println("high"+m);
                u = m-1;
            }
        }
    }
}
