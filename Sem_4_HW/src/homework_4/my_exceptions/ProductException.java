package homework_4.my_exceptions;

public class ProductException extends Exception {
    private String productName;

    public ProductException(String productName) {
        super();
        this.productName = productName;
    }

    @Override
    public String getMessage() {
        return "Error! A non-existent product (" + productName + ") was passed to the method. The purchase WAS NOT made.";
    }
}
