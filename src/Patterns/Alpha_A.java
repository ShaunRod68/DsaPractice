package Patterns;

public class Alpha_A {
    public static void main(String[] args) {
        int size =9;
        for (int i = 1;i<=size;i++){
            for (int k = 0;k<(size)-i;k++){
                System.out.print(" ");
            }
            for (int j = 1;j<=(2*i)-1;j++){
                if (j==1 || j==(2*i)-1 || i==(size/2)+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
