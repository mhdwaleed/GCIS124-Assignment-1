package PegGame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTesting {
    // Location Test
    @Test  
    public void testLocationGetters() {
        Location location = new Location(3, 4);
        assertEquals(3, location.getRow());
        assertEquals(4, location.getCol());
    }
    
    // Move Test
    @Test
    public void testMoveGetters() {
        Location from = new Location(1, 1);
        Location to = new Location(2, 3);
        Move move = new Move(from, to);
        assertEquals(from, move.getFrom());
        assertEquals(to, move.getTo());
    }

    // PegGameTest
    @Test
    public void testGetGameState() {
        SquarePegGame squarePegGame = new SquarePegGame(5, 5);
        GameState gameState = squarePegGame.getGameState();
        assertEquals(GameState.NOT_STARTED, gameState);
    }

    // SquarePegGameTest
    @Test
    public void testToString() {
        SquarePegGame squarePegGame = new SquarePegGame(4, 4);
        String expectedString = "oo.oo\noo.oo\noo.oo\noo.oo\n";
        assertEquals(expectedString, squarePegGame.toString());
    }

}
