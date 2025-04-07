package space_travel.exception;

public class DataRetrievalException extends RuntimeException {
    public DataRetrievalException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataRetrievalException(String message) {
        super(message);
    }
}
