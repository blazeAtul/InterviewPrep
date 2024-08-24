package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 1};
        removeOccurence(arr, 1);
    }

    public static void removeOccurence(int[] arr, int eleToRemove) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        for (int list : arr) {
            arrayList.add(list);
        }
        while (count < arrayList.size()) {
            if ((arrayList.get(count).equals(eleToRemove))) {
                arrayList.remove(count);
            }
            count++;
        }
        System.out.println(Arrays.toString(arrayList.toArray()));
    }
}
