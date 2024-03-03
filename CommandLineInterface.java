package PegGame;

import java.util.Scanner;

/**
 * Plays a peg game using the given PegGame object
 *
 * @param pegGame The PegGame object to be used for the game
 */

public class CommandLineInterface {
    public static void playGame(PegGame pegGame) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Peg Game!");

            while (true) {
                System.out.println("Current board:");
                System.out.println(pegGame);

                System.out.println("Enter your move: current row current col to new row new col (eg. 0 0 1 3)| 'q' to quit");
                String[] input = scanner.nextLine().split(" ");

                if (input.length == 1 && input[0].equalsIgnoreCase("q")) {
                    quit();
                    return;
                }

                try {
                    int r1 = Integer.parseInt(input[0]);
                    int c1 = Integer.parseInt(input[1]);
                    int r2 = Integer.parseInt(input[2]);
                    int c2 = Integer.parseInt(input[3]);
                    pegGame.makeMove(new Move(new Location(r1, c1), new Location(r2, c2)));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input --> Please enter numbers separated by spaces");
                    continue;
                } catch (PegGameException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                GameState gameState = pegGame.getGameState();
                if (gameState == GameState.WON) {
                    System.out.println("Congratulations! You WIN");
                    break;
                } else if (gameState == GameState.STALEMATE) {
                    System.out.println("No valid left --> GAME OVER");
                    break;
                }
            }
            scanner.close();
        }
    }
    private static void quit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
  }

