package Messages_And_Flow.Gameplay;
import Messages_And_Flow.Message;

public class BoardUpdatedMessage extends Message {
    private BoardUpdatedPayload payload;

    public BoardUpdatedMessage(String messageId, String senderId, String channel, String timestamp, BoardUpdatedPayload payload) {
        super(messageId, senderId, channel, timestamp, "BOARD_UPDATED");
        this.payload = payload;
    }

    public BoardUpdatedPayload getPayload() {
        return this.payload;
    }
}