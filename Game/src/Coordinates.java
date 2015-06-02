/**
 * Created by jaswanth on 01 Jun 15.
 */
public class Coordinates {
    private int positionX;
    private int positionY;

    private Coordinates(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public static Coordinates build(int x, int y){
        return new Coordinates(x,y);
    }
}
