package Messages_And_Flow.Lobby_And_Game_Setup;
import Messages_And_Flow.Message;

public class PlayerJoinedMessage extends Message {
    private BoardUpdatedPayload payload;

    public PlayerJoinedMessage(String messageId, String senderId, String channel, String timestamp, PlayerJoinedPayload payload) {
        super(messageId, senderId, channel, timestamp, "PLAYER_JOINED");
        this.payload = payload;
    }

    public PlayerJoinedPayload getPayload() {
        return this.payload;
    }
}