public class Floyd_Triangle {
    public static void main(String[] args) {
        int size = 30;
        int counter = 0;
        for(int i = 1;i<=(size/3 );i++){
            int j = 0;
            while (counter<size){
                System.out.print("*");
                j++;
                if(j==i){
                    break;
                }
                counter++;
            }
            System.out.println();
        }
        actualFlyod(5);
    }
    public static void actualFlyod(int n){
        int counter = 1;
        for(int i = 0;i<n;i++){

            for (int j = 0;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
