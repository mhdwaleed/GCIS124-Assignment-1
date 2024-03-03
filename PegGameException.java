package PegGame;

/**
 * The PegGameException class represents an exception that can occur during a peg game
 * It is used to indicate that an error has occurred while making a move in the game
 */

public class PegGameException extends Exception{
    /**
     * Constructs a new PegGameException with the specified detail message
     *
     * @param message The detail message which is called later using getmessage()
     */
    public PegGameException(String message){
        super(message);
    }
}
