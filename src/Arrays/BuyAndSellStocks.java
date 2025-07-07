package Arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int profit = 0;
        int start = 0;
        int end = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j< nums.length;j++){
                if (nums[j]-nums[i]>profit){
                    profit=nums[j]-nums[i];
                    start= i;
                    end = j;
                }
            }
        }
        System.out.println("Max Profit is:"+profit+"["+start+","+end+"]");
    }
}
