package Messages_And_Flow;

public class ConnectMessage extends Message {
    private ConnectPayload payload;

    public ConnectMessage(String messageId, String senderId, String channel,
                          String timestamp, ConnectPayload payload) 
    {
        super(messageId, senderId, channel, timestamp, "CONNECT");
        this.payload = payload;
    }

    public ConnectPayload getPayload() {
        return payload;
    }
}