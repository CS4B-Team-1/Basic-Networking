package Messages_And_Flow;

public abstract class Message {
    private String messageId;
    private String senderId;
    private String channel;
    private String timestamp;

    protected Message (String messageId, String senderId, String channel, String timestamp) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.channel = channel;
        this.timestamp = timestamp;
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
}
