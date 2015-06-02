/**
 * Created by jaswanth on 01 Jun 15.
 */
public class GameController {
    private Board board;

    private class Counter {
        private int aliveCount;
        private int deadCount;
        public Counter(int aliveCount, int deadCount) {
            this.aliveCount =aliveCount;
            this.deadCount = deadCount;
        }

        public int getAliveCount() {
            return aliveCount;
        }

        public int getDeadCount() {
            return  deadCount;
        }
    }

    public GameController(Board board) {
        this.board = board;
    }

    public void startGame(int iterations) {
        Cell[][] tBoard = new Cell[board.getMaxX()][board.getMaxY()];
        for (int i=0;i<iterations;i++) {
            for (int x=0;x<board.getMaxX();x++) {
                for (int y=0;y<board.getMaxY();y++) {
                    Cell cell = board.getCell(Coordinates.build(x, y));
                    Counter counter = getNeighbourStats(cell);
                    if (cell.getState() == CellState.ALIVE) {
                        if (counter.)
                    } else {

                    }
                }
            }
        }
    }

    private Counter getNeighbourStats(Cell cell) {
        int
    }
}
