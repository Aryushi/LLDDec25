package tictactoe.strategies.winningStrategy;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Move;
import tictactoe.models.Player;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy{
    private final Map<Integer, HashMap<Character, Integer>> colMaps = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Character aChar = move.getPlayer().getSymbol().getAchar();

        if(!colMaps.containsKey(col)){
            colMaps.put(col,new HashMap<>());
        }
        Map<Character, Integer> currColMap = colMaps.get(col);
        if(!currColMap.containsKey(aChar)){
            currColMap.put(aChar, 0);
        }

        currColMap.put(aChar, currColMap.get(aChar) + 1);
        return currColMap.get(aChar).equals(board.getSize());
    }
}
