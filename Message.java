import java.io.Serializable;

public class Message implements Serializable {
    private String message = "test";

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() { return this.message; }
}
