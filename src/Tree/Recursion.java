package Tree;

public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.simpleDecrement(50);
        r.increment(5);
        System.out.println("Power");
        System.out.println(r.power(12,12));
    }
    public long power(int a,int b){
        if (b==0){
            return 1;
        }
        return power(a,b-1)*a;
    }
    public  void increment(int n){
        if (n==0){
            System.out.println();
            return;
        }
        increment(n-1);
        System.out.print(n+" ");
    }
    public void Factorial(int n){

    }





    //MEmory stack
    public void simpleDecrement(int n){
        if(n==0){//base condition
            System.out.println(n);
            return;
        }else {
            System.out.print(n+",");
            simpleDecrement(n-1);
        }
    }
    public void simpleIncrement(int n){
        if (n==0){
            System.out.print(" ");
            return;
        }
        simpleIncrement(n-1);
        System.out.print(n);
    }



}
