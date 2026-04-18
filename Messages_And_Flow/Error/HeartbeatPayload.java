package Messages_And_Flow.Error;

public class HeartbeatPayload {
    private String timestamp;

    public HeartbeatPayload(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() { 
        return timestamp; 
    }
}
