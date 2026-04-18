package Messages_And_Flow.Lobby_And_Game_Setup;

public class PlayerJoinedPayload {
    private String playerId;
    private String gameId
    
    public PlayerJoinedPayload(String playerId, String gameId, String symbol/*X or O*/) {
        this.playerId = playerId;
        this.gameId = gameId
    }

    public String getPlayerId() {
        return this.playerId;
    }
    
    public String getGameId() {
        return this.gameId;
    }

    public String getSymbol() {
        return this.symbol;
    }