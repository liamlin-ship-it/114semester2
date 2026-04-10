import java.util.Scanner;

public class Apr9thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] board = new char[9];
        String input = scanner.nextLine();

        for (int i = 0; i < 9; i++) {
            board[i] = input.charAt(i);
        }

        // define a 2D array containing all 8 possible winning combinations
        int[][] wins = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},    // The 3 horizontal rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},    // The 3 vertical columns
                {0, 4, 8}, {2, 4, 6}    // The 2 diagonals
        };

        boolean win = false;
        // loop through every single winning combination in our 'wins' list
        for (int[] w : wins){
            if (board[w[0]] == board[w[1]] && board[w[1]] == board[w[2]]){
                win = true;
                break;
            }
        }

        System.out.println(win ? "win" : "tie");
        scanner.close();
    }
}
