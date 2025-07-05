package Patterns;

public class Half_Pyramid {
    public static void main(String[] args) {
        int size = 20;
        for (int i = 0;i<size;i++){
            for (int j=0;j<size;j++){
                if (j+i<size){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println("*");
        }
    }
}
