public class QuantityException extends Exception {
    public enum ExceptionType{
        INVALID_QUANTITY_COMPARE,
        NEGATIVE_VALUE;
    };
    ExceptionType type;
    public QuantityException(ExceptionType type,String message){
        super(message);
        this.type=type;
    }
}
