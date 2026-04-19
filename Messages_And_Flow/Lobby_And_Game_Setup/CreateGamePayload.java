package Messages_And_Flow.Lobby_And_Game_Setup;

public class CreateGamePayload {
    private String playerId;

    public CreateGamePayload(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerId() {
        return this.playerId;
    }
