public class Hollow_Rectangle {
    public static void main(String[] args){
        int lenght = 10;
        int breadth = 20;
        for(int i=1;i<=lenght;i++){

            for(int j = 1;j<=breadth;j++){
                if (i==1||j==1||i==lenght||j==breadth){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}