package Patterns;

public class Alpha_U {
    public static void main(String[] args) {
        int size = 10;
        int bottom_rows = (int) (size*(0.2))+1;
        for (int i = 1;i<=size;i++){

            for (int j = 1;j<=size;j++){
                if (i<=(size*0.8)){
                    if (j==1||j==size){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                } else if (i>(size*0.8)) {
                    int n = size-i+1;
                    int m = bottom_rows-n+1;
                    if(j<m){
                        System.out.print(" ");
                    }else if(j==m){
                        System.out.print("*");
                    }else if(j==size-m+1){
                        System.out.print("*");
                    } else if(i==size && j<=size-m){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
