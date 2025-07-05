package Patterns;

public class Triangle_0_1 {
    public static void main(String[] args) {
        int height=5;
        int counter = 1;
        for(int i = 0;i<height;i++){

            for(int j = 0;j<=i;j++){
                System.out.print(counter%2);
                counter++;
            }
            System.out.println();
        }
    }
}
