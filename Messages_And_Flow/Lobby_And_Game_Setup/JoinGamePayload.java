package Messages_And_Flow.Lobby_And_Game_Setup;

public class JoinGamePayload {
    private String playerId;
    private String gameId

    public JoinGamePayload(String playerId, String gameId) {
        this.playerId = playerId;
        this.gameId = gameId
    }

    public String getPlayerId() {
        return this.playerId;
    }
    
    public String getGameId() {
        return this.gameId;
    }