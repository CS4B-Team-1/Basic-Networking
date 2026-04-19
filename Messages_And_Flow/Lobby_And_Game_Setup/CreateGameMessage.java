package Messages_And_Flow.Lobby_And_Game_Setup;
import Messages_And_Flow.Message;

public class CreateGameMessage extends Message {
    private BoardUpdatedPayload payload;

    public CreateGameMessage(String messageId, String senderId, String channel, String timestamp, CreateGamePayload payload) {
        super(messageId, senderId, channel, timestamp, "CREATE_GAME");
        this.payload = payload;
    }

    public CreateGamePayload getPayload() {
        return this.payload;
    }
}