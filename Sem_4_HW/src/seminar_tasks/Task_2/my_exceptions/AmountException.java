package seminar_tasks.Task_2.my_exceptions;

public class AmountException extends Exception {
    private int amount;

    public AmountException(int amount) {
        super();
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        if (amount <= 0) {
            return "Error! A negative or zero quantity value (" + amount + ") was passed to the method.";
        } else if (amount > 100) {
            return "Error! Too large quantity value (" + amount +") was passed to the method.";
        }
        return "Something is wrong with amount orders!";
    }
}
