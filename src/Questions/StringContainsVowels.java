package Questions;

public class StringContainsVowels {
    public static void main(String[] args) {
        vowelCheckUsingMatches("lion");
        vowelCheckUsingFor("Lion");
    }

    public static void vowelCheckUsingMatches(String name) {
        if (name.toLowerCase().matches(".*[aeiou].*")) {
            System.out.println("Contains vowel");
        } else System.out.println("Not contains");
    }

    public static void vowelCheckUsingFor(String name) {
        name = name.toLowerCase();
        for (int i = 0; i <= name.length() - 1; i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                System.out.println(name + " contains vowel at index " + i);
            } else {
                System.out.println(name + " not contains vowel at index " + i);
            }
        }
    }
}
