/**
 * fibbonaci
 */
public class fibbonaci {

    public static int fibonacci(int n){

        if (n<=1) {
            System.out.println(n+" is <=1");
            return n;
        }
        System.out.println("fibonacci(n-1)+fibonacci(n-2)"+(fibonacci(n-1)+fibonacci(n-2)));
        return fibonacci(n-1)+fibonacci(n-2);

    }
    
public static void main(String[] args) {
    int n= 1;
    System.out.println("n value is:"+n);
    System.out.println("the fibonacci of "+n+"th value is :"+fibonacci(n));
}
}