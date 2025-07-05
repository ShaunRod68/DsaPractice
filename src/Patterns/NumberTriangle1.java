package Patterns;

public class NumberTriangle1 {
    public static void main(String[] args) {
        int height = 10;
        for (int i = 1;i<=height;i++){
            for (int k = 0;k<height-i;k++){
                System.out.print(" ");
            }
            for (int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            for (int j=1;j<i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
