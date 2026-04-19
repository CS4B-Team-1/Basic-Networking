package Messages_And_Flow.GameEndMessages;

public class GameDrawPayload {
    private String gameId;
    private String finalBoard;

    public GameDrawPayload(String gameId, String finalBoard) {
        this.gameId = gameId;
        this.finalBoard = finalBoard;
    }

    public String getGameId() {
        return gameId;
    }

    public String getFinalBoard() {
        return finalBoard;
    }
}