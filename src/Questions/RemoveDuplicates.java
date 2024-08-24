package Questions;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] str = {"Atul", "Test", "Atul"};
        int[] num = {1, 2, 3, 4, 5, 5, 4};
        removeDupFromString("hello");
        System.out.println();
        removeDupFromNumber(1223345555);
        System.out.println();
        removeDupFromStringArray(str);
        System.out.println();
        removeDupFromIntArray(num);
        System.out.println();
        removeDupUsingFor("ABCABB");
    }

    public static void removeDupFromString(String s) {
        char[] ch = s.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (Character c : ch) {
            boolean flag = characters.add(c); //In hashset when we add duplicate in that case it will return false;
            if (flag) {
                System.out.printf(c.toString());
            }
        }
    }

    public static void removeDupFromNumber(int num) {
        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (Character c : ch) {
            boolean flag = characters.add(c); //In hashset when we add duplicate in that case it will return false;
            if (flag) {
                System.out.printf(c.toString());
            }
        }
    }

    public static void removeDupFromStringArray(String[] str) {
        HashSet<String> hashSet = new HashSet<>();
        for (String s : str) {
            if (hashSet.add(s)) {
                System.out.printf(s);
            }
        }
    }

    public static void removeDupFromIntArray(int[] num) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int j : num) {
            boolean flag = hashSet.add(j);
            if (!flag) {
                System.out.printf(String.valueOf(j));
            }
        }
    }

    public static void removeDupUsingFor(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = s.indexOf(ch, i + 1);//indexOf will return the index value if the element is already in the string else return -1
            if (index == -1) {
                res.append(s.charAt(i));
            }
        }
        System.out.println(res);
    }
}