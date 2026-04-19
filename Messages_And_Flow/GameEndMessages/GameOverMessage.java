package Messages_And_Flow.GameEndMessages;
import Messages_And_Flow.Message;

public class GameOverMessage extends Message {
    private GameOverPayload payload;

    public GameOverMessage(String messageId, String senderId, String channel, String timestamp, GameOverPayload payload) {
        super(messageId, senderId, channel, timestamp, "GAMEOVER");
        this.payload = payload;
    }

    public GameOverPayload getPayload() {
        return payload;
    }
}