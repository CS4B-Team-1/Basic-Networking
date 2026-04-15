package Messages_And_Flow;

public class DisconnectMessage extends Message {
    private DisconnectPayload payload;

    public DisconnectMessage(String messageId, String senderId, String channel,
                             String timestamp, DisconnectPayload payload) 
    {
        super(messageId, senderId, channel, timestamp, "DISCONNECT");
        this.payload = payload;
    }

    public DisconnectPayload getPayload() {
        return payload;
    }
}