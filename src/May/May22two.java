package May;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class May22two {
    public static void main(String[] args) {
        ArrayList<HashSet<String>> list = new ArrayList<>();

        // Read input data, split by comma, and store in HashSet
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            HashSet<String> set = new HashSet<>();
            for (String value : scanner.nextLine().split(",")) {
                set.add(value);
            }
            list.add(set);
        }

        // Read the value to remove
        String valueToRemove = scanner.nextLine();

        // Remove HashSet objects containing the specified value
        removeSetsContainingValue(list, valueToRemove);

        // Show the first and last elements of the list.
        // The HashSet is shown as string, where the elements are sorted alphabetically.
        if (!list.isEmpty()) {
            ShowSortedSet(list.getFirst());
            ShowSortedSet(list.getLast());
        }
        else {
            System.out.println("Empty");
        }
    }

    public static void ShowSortedSet(HashSet<String> set) {
        ArrayList<String> sortedList = new ArrayList<>(set);
        sortedList.sort(null);
        System.out.println(String.join(",", sortedList));
    }

    public static void removeSetsContainingValue(ArrayList<HashSet<String>> list, String valueToRemove){
        for (int i = list.size() - 1; i >= 0; i--){
            // If each list contains 'valueToRemove', delete it.
            if (list.get(i).contains(valueToRemove)){
                list.remove(i);
            }
        }
    }
}
