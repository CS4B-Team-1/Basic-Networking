package Messages_And_Flow;

public class UnsubscribeMessage extends Message {
    private UnsubscribePayload payload;

    public UnsubscribeMessage(String messageId, String senderId, String channel,
                              String timestamp, UnsubscribePayload payload) 
    {
        super(messageId, senderId, channel, timestamp, "UNSUBSCRIBE");
        this.payload = payload;
    }

    public UnsubscribePayload getPayload() { 
        return payload; 
    }
}