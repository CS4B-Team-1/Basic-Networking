package Messages_And_Flow;

public class ErrorMessage extends Message {
    private ErrorPayload payload;

    public ErrorMessage(String messageId, String senderId, String channel, ErrorPayload payload, ) {
        super(messageId, senderId, channel, timestamp, "ERROR");
        this.payload = payload;
    }

    public ErrorPayload getErrorDetails() {
        return this.payload;
    }
}
