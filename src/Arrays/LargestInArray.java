package Arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,14,2,13,25,29,7};
        int max = 0;
        for (int num : nums){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Maximum number is "+max);
    }
}
