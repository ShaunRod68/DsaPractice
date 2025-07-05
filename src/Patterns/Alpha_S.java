package Patterns;

public class Alpha_S {
    public static void main(String[] args) {
        int size = 9;
        for (int i = 1;i<=size;i++){
            for (int j = 0;j<size;j++){
                if(i==1 || i ==size/2 || i==size){
                    System.out.print("*");
                } else if (i<size/2 && j==0) {
                    System.out.print("*");
                } else if (i>size/2 && j==size-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
