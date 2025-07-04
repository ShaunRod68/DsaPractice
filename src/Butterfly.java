public class Butterfly {
    public static void main(String[] args) {
        int height = 50;
        int weight = 30;

        for(int i = 0;i<height/2;i++){
            for (int j = 0;j<weight/2;j++){
                if (j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0;j<weight/2;j++){
                if((i+j+1)>=(weight/2)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0;i<height/2;i++){
            for(int j = 0;j<weight/2;j++){
                if((i+j+1)<=(weight/2)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j = 0;j<weight/2;j++){
                if (j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
