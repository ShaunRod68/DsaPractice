package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int key = 13;
        int[] nums = {3,4,5,6,14,2,13,25,29,7};
        for (int i = 0;i<nums.length;i++){
            if(nums[i]==key){
                System.out.println("Key at "+i);
                break;
            }
            if(i+1== nums.length){
                System.out.println("Key not found");
            }
        }
    }
}
