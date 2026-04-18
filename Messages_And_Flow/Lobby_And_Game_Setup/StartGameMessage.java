package Messages_And_Flow.Lobby_And_Game_Setup;
import Messages_And_Flow.Message;

public class StartGameMessage extends Message {
    private BoardUpdatedPayload payload;

    public StartGameMessage(String messageId, String senderId, String channel, String timestamp, StartGamePayload payload) {
        super(messageId, senderId, channel, timestamp, "START_GAME");
        this.payload = payload;
    }

    public StartGamePayload getPayload() {
        return this.payload;
    }
}