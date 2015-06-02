/**
 * Created by jaswanth on 01 Jun 15.
 */
public class Board {
    private int maxX;
    private int maxY;
    private Cell[][] board;

    public Board(int x, int y) {
        this.maxX = x;
        this.maxY = y;
        this.board = new Cell[x][y];
    }

    public int getMaxX(){
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setCell(Cell cell) {
        board[cell.getCoordinates().getPositionX()][cell.getCoordinates().getPositionY()] = cell;
    }

    public Cell getCell(Coordinates coords) {
        return board[coords.getPositionX()][coords.getPositionY()];
    }

}
