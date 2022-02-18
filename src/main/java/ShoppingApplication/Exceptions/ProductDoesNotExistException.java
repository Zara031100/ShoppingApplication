package ShoppingApplication.Exceptions;

public class ProductDoesNotExistException extends Exception{
    public ProductDoesNotExistException(String message){
        super(message);
    }
}
