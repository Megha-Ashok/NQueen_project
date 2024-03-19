package game;

import board.Board;

public class Game {

    Board b;

    public Game(Board b) {
        this.b = b;
    }

    public void play() {
        if (b.getsize() < 4) {
            System.out.println("no configuration vailable");
            return;
        }
        nqueen_helper(0);
    }

    private void nqueen_helper(int row) {
        if (row == b.getsize()) {
            b.printBoard();
            return;
        }
        for (int i = 0; i < b.getsize(); i++) {
            if (isSafeQueen(row, i) == true) {
                b.board[row][i] = 'X';
                nqueen_helper(row + 1);
                b.board[row][i] = '-';
            }
        }
    }

    private boolean isSafeQueen(int row, int col) {
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (b.board[i][j] == 'X') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < b.getsize(); i--, j++) {
            if (b.board[i][j] == 'X') {
                return false;
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            if (b.board[i][col] == 'X') {
                return false;
            }
        }
        return true;

    }

}
