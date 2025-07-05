package Patterns;

public class Invert_Half_Pyramid {
    public static void main(String[] args) {
        int size = 5;
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                if(i+j<size){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
