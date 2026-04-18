package Messages_And_Flow;

public class MakeMoveMessage extends Message {
    private MakeMovePayload payload;

    public MakeMoveMessage(String messageId, String senderId, String channel, String timestamp, MakeMovePayload payload) {
        super(messageId, senderId, channel, timestamp, "MAKE_MOVE");
        this.payload = payload;
    }

    public MakeMovePayload getPayload() {
        return this.payload;
    }
}