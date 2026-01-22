package tictactoe;

import tictactoe.exception.InvalidMoveException;
import tictactoe.models.Game;
import tictactoe.models.GameState;
import tictactoe.models.Player;
import tictactoe.strategies.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {
    //makeMove
    //undo
    //checkWinner
    //gameState

    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies){
        return Game.getBuilder().setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }
     public  void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
     }

     public GameState gameState(Game game){
        return game.getGameState();
     }

     public Player getWinner(Game game){
        return game.getWinner();
     }

     public void printBoard(Game game) {
        game.printBoard();
     }

     public void undo(Game game){

     }
}
