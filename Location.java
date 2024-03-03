package PegGame;

import java.util.Objects;

/**
 * The Location class represents a position in a two-dimensional grid.
 * It is used to store the row and column of a location.
 */

public class Location {

    private int row;
    private int col;

    // Constructor

    /**
     * Constructs a new Location with the specified row and column.
     *
     * @param row The row of the location.
     * @param col The column of the location.
     */

    public Location(int row, int col){
        this.row = row;
        this.col = col;
    }

    // Generate Getters

    /**
     * @return The row of this location.
     */

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }  

    // ToString Method()

    /**
     * @return A string representation of this location.
     */

    @Override
    public String toString() {
        return "(" + row + ", " + col + ")";
    }

    // Hashcode Method()

    /**
     * @return A hash code value for this object.
     */
    
    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}

