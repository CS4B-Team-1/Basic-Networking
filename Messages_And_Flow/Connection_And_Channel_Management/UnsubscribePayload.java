package Messages_And_Flow.Connection_And_Channel_Management;


public class UnsubscribePayload {
    private String clientId;
    private String channel;

    public UnsubscribePayload(String clientId, String channel) {
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