package Questions;

public class Palindrome {
    public static void main(String[] args) {
        palindromeString("race");
        palindromeNum(122);
    }

    public static void palindromeString(String name) {
        String s="";
        for (int i = name.length() - 1; i >= 0; i--) {
            s+=name.charAt(i);
        }
        System.out.println(s);
        if(s.equals(name)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
    public static void palindromeNum(int n){
        String num=String.valueOf(n);
        String rev="";
        for(int i=num.length()-1;i>=0;i--){
            rev= rev+num.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(num)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
