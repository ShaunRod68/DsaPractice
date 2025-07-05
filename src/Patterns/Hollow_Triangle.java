package Patterns;

public class Hollow_Triangle {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 1;i<=height;i++){
            for(int k = 0;k<height-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(i*2)-1;j++){
                if (j==1 || i==height || j==(i*2)-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

