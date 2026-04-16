import java.util.Scanner;

public class Apr9fiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[][] board = new char[3][3];
        int stringIndex = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = input.charAt(stringIndex);
                stringIndex++;
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 'x'){
                    System.out.print("x ");
                }else {
                    int count = getCount(row, col, board);
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }
    }

    // we are currently standing on a safe blank cell at (row, col)
    // our goal is to scan the 8 neighboring cells to count how many ('x') are around us
    public static int getCount(int row, int col, char[][] board) {
        int count = 0;

        // make sure the neighbor's coordinate is strictly inside the 3x3 room
        for (int distanceR = -1; distanceR <= 1; distanceR++) {
            for (int distanceC = -1; distanceC <= 1; distanceC++) {
                int neighborRow = row + distanceR;
                int neighborCol = col + distanceC;


                // we are a blank cell. If our neighbor is a ('x'), our danger level increases
                if (neighborRow >= 0 && neighborRow < board.length && neighborCol >= 0 && neighborCol < board.length){
                    if (board[neighborRow][neighborCol] == 'x'){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
