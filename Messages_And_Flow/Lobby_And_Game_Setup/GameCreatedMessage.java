package Messages_And_Flow.Lobby_And_Game_Setup;
import Messages_And_Flow.Message;

public class GameCreatedMessage extends Message {
    private BoardUpdatedPayload payload;

    public GameCreatedMessage(String messageId, String senderId, String channel, String timestamp, GameCreatedPayload payload) {
        super(messageId, senderId, channel, timestamp, "GAME_CREATED");
        this.payload = payload;
    }

    public GameCreatedPayload getPayload() {
        return this.payload;
    }
}