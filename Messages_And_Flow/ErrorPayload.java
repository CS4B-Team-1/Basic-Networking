package Messages_And_Flow;

public class ErrorPayload {
    private String errorCode;
    private String errorDescription;

    public SubscribePayload(String errorCode, String errorDescription) {
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    public String getErrorCode() { 
        return errorCode; 
    }
    public String getErrorDescription() { 
        return errorDescription; 
    }
}
