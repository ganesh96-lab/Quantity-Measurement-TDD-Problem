public class QuantityException extends Exception {
    public enum ExceptionType{
        INVALID_QUANTITY_COMPARE,
        NEGATIVE_VALUE,
        TEMP_NOT_ADDED;
    };
    ExceptionType type;
    public QuantityException(ExceptionType type,String message){
        super(message);
        this.type=type;
    }
}
