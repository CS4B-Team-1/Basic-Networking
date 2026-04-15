package Messages_And_Flow;

public class SubscribePayload {
    private String clientId;
    private String channel;

    public SubscribePayload(String clientId, String channel) {
        this.clientId = clientId;
        this.channel = channel;
    }

    public String getClientId() { 
        return clientId; 
    }
    public String getChannel() { 
        return channel; 
    }
}