public class Rombus {
    public static void main(String[] args) {
        int size = 10;
        for(int i = 1; i<=size;i++){

            for (int j = 0;j<size-i;j++){
                System.out.print(" ");
            }
            for (int k = 0;k<size;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
