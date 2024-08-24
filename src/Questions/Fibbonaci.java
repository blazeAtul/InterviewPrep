package Questions;

public class Fibbonaci {
    public static void main(String[] args) {
        fib(5);
    }
    public static void fib(int n){
        int first=0;
        int second=1;
        int count=1;
        while(count<=n){
            System.out.print(first+" ");
            int sum=first+second;
            first=second;
            second=sum;
            count++;
        }
    }
}
