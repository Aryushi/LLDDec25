package tictactoe.strategies.winningStrategy;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Move;
import tictactoe.models.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
