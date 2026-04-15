package Messages_And_Flow;

public class ConnectPayload {
    private String clientId;
    private String clientType;

    public ConnectPayload(String clientId, String clientType) {
        this.clientId = clientId;
        this.clientType = clientType;
    }

    public String getClientId() {
        return clientId;
    }
    public String getClientType() {
        return clientType; 
    }
}