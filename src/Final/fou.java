package Final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class fou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> books = BookCollector.getInputData(scanner, 5);

        String category = scanner.next();
        scanner.close();

        BookAnalyzer analyzer = new BookAnalyzer(books);
        int distinctCount = analyzer.countDistinctValues(category);

        System.out.println(distinctCount);
    }
}

class BookCollector {
    public static ArrayList<HashMap<String, String>> getInputData(Scanner scanner, int numberOfBooks) {
        ArrayList<HashMap<String, String>> books = new ArrayList<>();
        for (int i = 0; i < numberOfBooks; i++) {
            HashMap<String, String> book = new HashMap<>();
            String title = scanner.next();
            String author = scanner.next();
            String genre = scanner.next();
            book.put("title", title);
            book.put("author", author);
            book.put("genre", genre);
            books.add(book);
        }
        return books;
    }
}

class BookAnalyzer {
    private ArrayList<HashMap<String, String>> books;

    public BookAnalyzer(ArrayList<HashMap<String, String>> books) {
        this.books = books;
    }

    public int countDistinctValues(String categoryName) {
        HashSet<String> set = new HashSet<>();

        for (HashMap<String, String> book : books){
            set.add(book.get(categoryName));
        }

        return set.size();
    }
}
