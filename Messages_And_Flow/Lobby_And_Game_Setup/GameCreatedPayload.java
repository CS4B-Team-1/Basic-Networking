package Messages_And_Flow.Lobby_And_Game_Setup;

public class GameCreatedPayload {
    private String gameId;
    private String channel;
    private String status;


    public GameCreatedPayload(String gameId, String channel, String status) {
        this.gameId = gameId;
        this.channel = channel;
        this.status = status; 
    }

    public String getGameId() {
        return this.gameId;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getStatus() {
        return this.status;
    }
