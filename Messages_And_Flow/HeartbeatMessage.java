package Messages_And_Flow;

public class HeartbeatMessage extends Message {
    private HeartbeatPayload payload;

    public ErrorMessage(String messageId, String senderId, String channel, String timestamp, HeartbeatPayload payload) {
        super(messageId, senderId, channel, timestamp, "HEARTBEAT");
        this.payload = payload;
    }

    public String getErrorDetails() {
        return this.payload;
    }
}
