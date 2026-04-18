package Messages_And_Flow.Error;
import Messages_And_Flow.Message;

public class HeartbeatMessage extends Message {
    private HeartbeatPayload payload;

    public HeartbeatMessage(String messageId, String senderId, String channel, String timestamp, HeartbeatPayload payload) {
        super(messageId, senderId, channel, timestamp, "HEARTBEAT");
        this.payload = payload;
    }

    public HeartbeatPayload getPayload() {
        return this.payload;
    }
}
