public class QuantityException extends Exception {
    public enum ExceptionType{
        INVALID_QUANTITY_COMPARE
    };
    ExceptionType type;
    public QuantityException(ExceptionType type,String message){
        this.type=type;
    }
}
