package Messages_And_Flow.Connection_And_Channel_Management;
import Messages_And_Flow.Message;

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