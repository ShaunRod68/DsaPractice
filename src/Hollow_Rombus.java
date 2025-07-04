public class Hollow_Rombus {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 1;i<=size;i++){

            for (int k = 0;k<size-i;k++){
                System.out.print(" ");
            }
            for (int j = 1;j<=size;j++){
                if(i==1 || j==1 || i==size || j==size){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
