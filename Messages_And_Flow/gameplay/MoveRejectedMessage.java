package Messages_And_Flow;

public class MoveRejectedMessage extends Message {
    private MoveRejectedPayload payload;

    public MoveRejectedMessage(String messageId, String senderId, String channel, String timestamp, MoveRejectedPayload payload) {
        super(messageId, senderId, channel, timestamp, "MOVE_REJECTED");
        this.payload = payload;
    }

    public MoveRejectedPayload getPayload() {
        return this.payload;
    }
}