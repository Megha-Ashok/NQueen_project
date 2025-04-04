package board;

public class Board {
  int size;
  public char board[][];

  public Board(int size) {
    this.size = size;
    board = new char[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        board[i][j] = '-';
      }
    }
  }

  public void printBoard() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }

  }

  public int getsize() {
    return this.size;
  }
}
