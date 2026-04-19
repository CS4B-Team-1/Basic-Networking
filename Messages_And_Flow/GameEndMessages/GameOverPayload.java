package Messages_And_Flow.GameEndMessages;

public class GameOverPayload {
    private String gameId;
    private String result;
    private String finalBoard;

    public GameOverPayload(String gameId, String result, String finalBoard) {
        this.gameId = gameId;
        this.result = result;
        this.finalBoard = finalBoard;
    }

    public String getGameId() {
        return gameId;
    }

    public String getResult() {
        return result;
    }

    public String getFinalBoard() {
        return finalBoard;
    }
}