package Messages_And_Flow.GameEndMessages;
import Messages_And_Flow.Message;

public class GameWonMessage extends Message {
    private GameWonPayload payload;

    public GameWonMessage(String messageId, String senderId, String channel, String timestamp, GameWonPayload payload) {
        super(messageId, senderId, channel, timestamp, "GAMEWON");
        this.payload = payload;
    }

    public GameWonPayload getPayload() {
        return payload;
    }
}