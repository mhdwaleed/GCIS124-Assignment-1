package PegGame;

import java.util.Objects;

/**
 * The Move class represents a move in the peg game.
 * It is used to store the location of the peg that is being moved from and the location where it is being moved to.
 */

public class Move {

    private Location from;
    private Location to;

    // Constructor

    /**
     * Constructs a new Move with the specified from and to locations.
     *
     * @param from The location of the peg that is being moved from.
     * @param to The location where the peg is being moved to.
     */

    public Move(Location from, Location to){
        this.from = from;
        this.to = to;
    }

    // Generate Getters

    /**
     * @return The location of the peg that is being moved from.
     */

    public Location getFrom() {
        return from;
    }
    public Location getTo() {
        return to;
    }

    // ToString Method()

    /**
     * @return A string representation of this move.
     */

    @Override
    public String toString() {
        return "("+ from + " -> " + to + ")";
    }

    // Hashcode Method()
    
    /**
     * @return A hash code value for this object.
     */

     @Override
     public int hashCode() {
        return Objects.hash(from, to);
    }
}
