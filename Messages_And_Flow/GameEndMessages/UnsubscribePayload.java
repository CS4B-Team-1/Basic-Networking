package Messages_And_Flow.GameEndMessages;

public class UnsubscribePayload {
    private String gameId;
    private String channel;

    public UnsubscribePayload(String gameId, String channel) {
        this.gameId = gameId;
        this.channel = channel;
    }

    public String getGameId() {
        return gameId;
    }

    public String getChannel() {
        return channel;
    }
}