public class Diamond {
    public static void main(String[] args) {
        int height=5;
        int count = 0;
        for (int i = 1;i<=height;i++){
            for(int k=0;k<height-i;k++){
                System.out.print(" ");
            }
            for (int j = 0;j<i+count;j++){
                System.out.print("*");
            }
            count++;
            System.out.println();
        }
        for (int i = height;i>=1;i--){
            for(int k=0;k<height-i;k++){
                System.out.print(" ");
            }
            for (int j = 0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
