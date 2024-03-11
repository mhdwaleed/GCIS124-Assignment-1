package peggame;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * This class contains JUnit tests for the PegGame package.
 */

public class JunitTesting {

     /**
     * Test case for Location class constructor and getters.
     */

    // Location Test
    @Test
    public void testLocationConstructorAndGetters() {
        Location location = new Location(1, 2);
        assertEquals(1, location.getRow());
        assertEquals(2, location.getCol());
    }

    /**
     * Test case for Move class constructor and getters.
     */
    
    // Move Test
    @Test
    public void testMoveConstructorAndGetters() {
        Location fromLocation = new Location(1, 2);
        Location toLocation = new Location(3, 4);
        Move move = new Move(fromLocation, toLocation);
        assertEquals(fromLocation, move.getFrom());
        assertEquals(toLocation, move.getTo());
    }

    /**
     * Test case for verifying enum values of GameState.
     */

    // GameState Test
    @Test
    public void testGameStateEnumValues() {
        assertEquals("NOT_STARTED", GameState.NOT_STARTED.name());
        assertEquals("IN_PROGRESS", GameState.IN_PROGRESS.name());
        assertEquals("STALEMATE", GameState.STALEMATE.name());
        assertEquals("WON", GameState.WON.name());
    }

    /**
    * Test case for verifying initial GameState of PegGame.
    */

    // PegGameTest
    @Test
    public void testGetGameState() {
        SquarePegGame squarePegGame = new SquarePegGame(5, 5);
        GameState gameState = squarePegGame.getGameState();
        assertEquals(GameState.NOT_STARTED, gameState);
    }

    /**
     * Test case for verifying toString() method of SquarePegGame.
     */

    // SquarePegGameTest
    @Test
    public void testToString() {
        SquarePegGame squarePegGame = new SquarePegGame(4, 4);
        String expectedString = "oo.oo\noo.oo\noo.oo\noo.oo\n";
        assertEquals(expectedString, squarePegGame.toString());
        }
}
