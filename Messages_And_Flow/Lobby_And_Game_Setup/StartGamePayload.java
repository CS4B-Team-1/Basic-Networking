package Messages_And_Flow.Lobby_And_Game_Setup;

public class StartGamePayload {
    private String playerId;
    private String gameId
    
    public StartGamePayload(String playerId, String gameId, String firstTurn, ArrayList<Integer> initialBoard) {
        this.playerId = playerId;
        this.gameId = gameId
    }

    public String getPlayerId() {
        return this.playerId;
    }
    
    public String getGameId() {
        return this.gameId;
    }

    public String getFirstTurn() {
        return this.firstTurn;
    }
    
    public String getInitialBoard() {
        return this.initialBoard;
    }