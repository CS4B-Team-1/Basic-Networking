package Messages_And_Flow;

public class SubscribeMessage extends Message {
    private SubscribePayload payload;

    public SubscribeMessage(String messageId, String senderId, String channel,
                            String timestamp, SubscribePayload payload)
    {
        super(messageId, senderId, channel, timestamp, "SUBSCRIBE");
        this.payload = payload;
    }

    public SubscribePayload getPayload() {
        return payload;
    }
}