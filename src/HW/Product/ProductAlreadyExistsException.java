package HW.Product;

public class ProductAlreadyExistsException extends Exception {
    public ProductAlreadyExistsException() {

    }

    public ProductAlreadyExistsException(String message) {
        super(message);
    }

}
