import java.util.Scanner;

/**
 * Created by jaswanth on 01 Jun 15.
 */
public class Main {
    private static  Scanner input = new Scanner(System.in);;
    public static  void main(String[] args) {
        int maxX,maxY;
        maxX = input.nextInt();
        maxY = input.nextInt();
        Board mainBoard = new Board(maxX, maxY);

        fillBoard(mainBoard);
        int iterations;
        iterations = input.nextInt();
        GameController gameController = new GameController(mainBoard);
        gameController.startGame(iterations);
    }

    private static void fillBoard(Board board) {
        int lines;
        int x, y, state;
        lines = input.nextInt();
        for (int z=0;z<lines;z++) {
            x = input.nextInt();
            y = input.nextInt();
            state = input.nextInt();
            board.setCell(new Cell(Coordinates.build(x,y), z==0? CellState.DEAD : CellState.ALIVE));
        }
    }
}
