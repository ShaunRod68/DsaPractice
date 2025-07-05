package Arrays;

public class Crud {
    public static void main(String[] args) {
        //Way 1
        int[] marks = new int[3];
        marks[0]=1;
        marks[1]=2;
        marks[2]=3;
        //Way 2
        String[] fruits = {"apple","mango","banana"};
        //read
        System.out.println(fruits.length);
        for (int mark : marks){
            System.out.print(mark+",");
        }
        update(marks);
        System.out.println("After update");
        for (int mark : marks){
            System.out.print(mark+",");
        }
        System.out.println("Update done");
        delete(marks,2);
        System.out.println("After delete");
        for (int mark : marks){
            System.out.print(mark+",");
        }
    }
    public static void update(int[] nums){
        for(int i = 0;i<nums.length;i++){
            nums[i]+=1;
        }
    }
    public static void delete(int[] nums,int del){
        for (int i = 0;i<nums.length;i++){
            if (nums[i]==del){

                for(int j = i;j<nums.length;j++){
                    if(j+1== nums.length){
                        nums[j]=0;
//                        System.out.println("End of array");
                    }else {
                        nums[j]=nums[j+1];
                        //System.out.println(j);
                    }
                }
            }
        }
    }
}
