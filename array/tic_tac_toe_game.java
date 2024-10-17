import java.util.*;

public class tic_tac_toe_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char board[][] = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        while (!gameOver) {
            displayBoard(board);
            System.out.println("Player " + player + "'s turn : ");
            int row = in.nextInt();
            int col = in.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won");
                } else {
                    player = player == 'X' ? 'O' : 'X';
                }
            } else {
                System.out.println("This position is already taken");
            }
        }
        displayBoard(board);

    }

    public static void displayBoard(char board[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean haveWon(char board[][], char player) {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }
        for (int j = 0; j < 3; j++) {
            if (board[j][0] == player && board[j][1] == player && board[j][2] == player)
                return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}