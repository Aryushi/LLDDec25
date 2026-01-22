package tictactoe.models;

import tictactoe.factories.BotPlayingStrategyFactory;
import tictactoe.strategies.botPlayingStrategy.BotPlayingStrategy;

import java.security.PrivateKey;

public class Bot  extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Symbol symbol, String name, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyFactory(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }

    @Override
    public Move makeMove(Board board) {
        return super.makeMove(board);
    }
}
