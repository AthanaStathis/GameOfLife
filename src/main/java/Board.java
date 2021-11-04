import javax.swing.*;

public class Board {


    private int rows;
    private int cols;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }


    public String[][] initialize() {
        String[][] boardWithCells = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 1 && (j == 1|| j==2))
                    boardWithCells[i][j] = "*";
                else
                boardWithCells[i][j] = ".";
            }
        }
        return boardWithCells;
    }

}
