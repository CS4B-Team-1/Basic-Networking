package Messages_And_Flow.Gameplay;
import Messages_And_Flow.Message;

public class MoveAcceptedMessage extends Message {
    private MoveAcceptedPayload payload;

    public MoveAcceptedMessage(String messageId, String senderId, String channel, String timestamp, MoveAcceptedPayload payload) {
        super(messageId, senderId, channel, timestamp, "MOVE_ACCEPTED");
        this.payload = payload;
    }

    public MoveAcceptedPayload getPayload() {
        return this.payload;
    }
}