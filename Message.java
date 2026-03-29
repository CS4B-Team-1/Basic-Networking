import java.io.Serializable;

public class Message implements Serializable {
    private String message = "test";

    public String getMessage() { return this.message; }
}
