package Messages_And_Flow.Gameplay;

public class BoardUpdatedPayload {
    private String gameId;
    private String board;
    private String currentTurn;

    public BoardUpdatedPayload(String gameId, String board, String currentTurn) {
        this.gameId = gameId;
        this.board = board;
        this.currentTurn = currentTurn;
    }

    public String getGameId() {
        return this.gameId;
    }

    public String getBoard() {
        return this.board;
    }

    public String getCurrentTurn() {
        return this.currentTurn;
    }
}