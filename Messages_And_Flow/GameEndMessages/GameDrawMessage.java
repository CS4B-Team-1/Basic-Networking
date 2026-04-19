package Messages_And_Flow.GameEndMessages;
import Messages_And_Flow.Message;

public class GameDrawMessage extends Message {
    private GameDrawPayload payload;

    public GameDrawMessage(String messageId, String senderId, String channel, String timestamp, GameDrawPayload payload) {
        super(messageId, senderId, channel, timestamp, "GAMEDRAW");
        this.payload = payload;
    }

    public GameDrawPayload getPayload() {
        return payload;
    }
}