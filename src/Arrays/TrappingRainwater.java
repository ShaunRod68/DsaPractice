package Arrays;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        int[] left_arr = new int[height.length];
        int[] right_arr = new int[height.length];
        for (int i = 0;i<height.length;i++){
            if (i==0){
                left_arr[i]=height[i];
            }else if(height[i]>left_arr[i-1]){
                left_arr[i]=height[i];
            }else {
                left_arr[i]=left_arr[i-1];
            }
        }
        for (int j = height.length-1;j>=0;j--){
            if (j==height.length-1){
                right_arr[j]=height[j];
            }else if(height[j]>right_arr[j+1]){
                right_arr[j]=height[j];
            }else {
                right_arr[j]=right_arr[j+1];
            }
        }
        int[] maxCapacity = new int[height.length];
        int[] capacity = new int[height.length];
        int total = 0;
        for (int i = 0;i< height.length;i++){
            maxCapacity[i]=Math.min(right_arr[i],left_arr[i]);
            capacity[i]=Math.subtractExact(maxCapacity[i],height[i]);
            total+=capacity[i];
        }
        for (int num:capacity){
            System.out.print(num+",");
        }
        System.out.println();
        System.out.println("Total Capacity:"+total+"Units");


    }
}
