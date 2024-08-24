package Questions;

public class ReverseString {
    public static void main(String[] args) {
        String name="Atul";
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        System.out.println("String before reverse "+name);
        System.out.println("-------------------------------");
        System.out.println("String after reverse "+rev);
    }

}
