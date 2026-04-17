package Messages_And_Flow;

public abstract class Message {
    private String messageId;
    private String senderId;
    private String channel;
    private String timestamp;
    private String messageType;

    protected Message (String messageId, String senderId, String channel, String timestamp, String messageType) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.channel = channel;
        this.timestamp = timestamp;
        this.messageType = messageType;
    }

    public String getMessageId(){
        return this.messageId;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getTimeStamp() {
        return this.timestamp;
    }

    public String getMessageType() {
        return this.messageType;
    }
}
