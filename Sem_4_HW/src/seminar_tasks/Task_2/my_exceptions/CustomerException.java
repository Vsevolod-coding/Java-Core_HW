package seminar_tasks.Task_2.my_exceptions;

public class CustomerException extends Exception {
    private String customerName;

    public CustomerException(String customerName) {
        super();
        this.customerName = customerName;
    }

    @Override
    public String getMessage() {
        return "Error! A non-existent customer (" + customerName + ") was passed to the method.";
    }
}
