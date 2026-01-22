package tictactoe.strategies.winningStrategy;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Move;
import tictactoe.models.Player;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{
    //2 DIAGONALS
    private final Map<Character, Integer> leftDiagonalMap = new HashMap<>(); //starting from 0,0
    private final Map<Character, Integer> rightDiagonalMap = new HashMap<>(); //starting from 0,n-1

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Character aChar = move.getPlayer().getSymbol().getAchar();

        //condition for let diagonal -> row == col
        if(row == col) {
            if(!leftDiagonalMap.containsKey(aChar)){
                        leftDiagonalMap.put(aChar, 0);
            }
            leftDiagonalMap.put(aChar, leftDiagonalMap.get(aChar) +1);
        }

        //Condition for right diagonal -> row + col = N-1
        if(row + col == board.getSize()-1){
            if(!rightDiagonalMap.containsKey(aChar)){
                rightDiagonalMap.put(aChar, 0);
            }
            rightDiagonalMap.put(aChar, rightDiagonalMap.get(aChar) +1);
        }

        return (row == col && leftDiagonalMap.get(aChar) == board.getSize()) || (row + col == board.getSize() - 1 && rightDiagonalMap.get(aChar) == board.getSize());
    }
}
