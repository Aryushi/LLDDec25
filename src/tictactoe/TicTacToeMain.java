package tictactoe;

import tictactoe.exception.InvalidMoveException;
import tictactoe.models.*;
import tictactoe.strategies.winningStrategy.ColumnWinningStrategy;
import tictactoe.strategies.winningStrategy.DiagonalWinningStrategy;
import tictactoe.strategies.winningStrategy.RowWinningStrategy;
import tictactoe.strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) throws InvalidMoveException {
        System.out.println("GAME STARTS");
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        //int dimension = scanner.nextInt();
        int dimension =3;

        //Take players information in the input
        List<Player> players = new ArrayList<>();
        players.add(
                new Player(new Symbol('X'), "Aryushi", PlayerType.HUMAN)
        );
        players.add(
                new Bot(new Symbol('O'),"Scaler",PlayerType.BOT,BotDifficultyLevel.EASY)
        );
        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColumnWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        Game game = gameController.startGame(dimension,players,winningStrategies);

        //gameController.printBoard(game);
        //Let's play the game

        while (gameController.gameState(game).equals(GameState.IN_PROGRESS)) {
            //1.show the board
            //2.make a move

            gameController.printBoard(game);
            System.out.println("Do you want to undo ? y/n");
            String isundo = scanner.next();

            if(isundo.equalsIgnoreCase("y")) {
                //make an undo opeartion
                gameController.undo(game);
                continue;
            }

            gameController.makeMove(game);
        }

        System.out.println("DEBUG");
    }
}
