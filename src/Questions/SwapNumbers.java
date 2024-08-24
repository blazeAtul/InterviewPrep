package Questions;

public class SwapNumbers {
    public static void main(String[] args) {
        int first = 12;
        int second = 23;
        System.out.println("Numbers before swap:-\nFirst Number= " + first + " \nSecond Number= " + second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("Numbers after swap:-\nFirst Number= " + first + " \nSecond Number= " + second);

    }
}
