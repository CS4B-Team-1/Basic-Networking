package Messages_And_Flow.Connection_And_Channel_Management;

public class DisconnectPayload {
    private String clientId;
    private String reason;

    public DisconnectPayload(String clientId, String reason) {
        this.clientId = clientId;
        this.reason = reason;
    }

    public String getClientId() {
        return clientId; 
    }
    public String getReason() {
        return reason; 
    }
}