package seminar_tasks.Task_1;

public class WrongLoginException extends Exception {
    private int loginLength;
    public WrongLoginException(int loginLength) {
        super();
        this.loginLength = loginLength;
    }

    @Override
    public String getMessage() {
        return String.format("Incorrect length of login, expected length to be less than 20. But given %d", loginLength);
    }
}
