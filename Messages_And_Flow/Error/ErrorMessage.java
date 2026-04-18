package Messages_And_Flow.Error;
import Messages_And_Flow.Message;

public class ErrorMessage extends Message {
    private ErrorPayload payload;

    public ErrorMessage(String messageId, String senderId, String channel, String timestamp, ErrorPayload payload) {
        super(messageId, senderId, channel, timestamp, "ERROR");
        this.payload = payload;
    }

    public ErrorPayload getPayload() {
        return this.payload;
    }
}
