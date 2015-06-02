/**
 * Created by jaswanth on 01 Jun 15.
 */
public class Cell {
    private CellState state;
    private Coordinates coordinates;

    public Cell( Coordinates coordinates,CellState state) {
        this.state = state;
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates(){
        return coordinates;
    }

    public CellState getState() {
        return state;
    }
}
