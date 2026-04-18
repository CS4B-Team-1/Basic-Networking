package Messages_And_Flow.Lobby_And_Game_Setup;
import Messages_And_Flow.Message;

public class JoinGameMessage extends Message {
    private BoardUpdatedPayload payload;

    public JoinGameMessage(String messageId, String senderId, String channel, String timestamp, BoardUpdatedPayload payload) {
        super(messageId, senderId, channel, timestamp, "JOIN_GAME");
        this.payload = payload;
    }

    public JoinGamePayload getPayload() {
        return this.payload;
    }
}