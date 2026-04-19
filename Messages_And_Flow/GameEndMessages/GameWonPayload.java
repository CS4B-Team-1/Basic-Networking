package Messages_And_Flow.GameEndMessages;

public class GameWonPayload {
    private String gameId;
    private String winner;
    private String winningLine;
    private String finalBoard;

    public GameWonPayload(String gameId, String winner, String winningLine, String finalBoard) {
        this.gameId = gameId;
        this.winner = winner;
        this.winningLine = winningLine;
        this.finalBoard = finalBoard;
    }

    public String getGameId() {
        return gameId;
    }

    public String getWinner() {
        return winner;
    }

    public String getWinningLine() {
        return winningLine;
    }

    public String getFinalBoard() {
        return finalBoard;
    }
}