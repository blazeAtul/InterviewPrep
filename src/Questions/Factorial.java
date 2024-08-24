package Questions;

public class Factorial {
    public static void main(String[] args) {
        fac(5);
    }

    public static void fac(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
