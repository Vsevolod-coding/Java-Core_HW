package seminar_tasks.Task_1;

public class WrongPasswordException extends Exception {
    private final int pwdLen;
    private final boolean pwdMatch;
    public WrongPasswordException(int pwdLen, boolean pwdMatch) {
        super();
        this.pwdLen = pwdLen;
        this.pwdMatch = pwdMatch;
    }

    @Override
    public String getMessage() {
        boolean pwdLenBad = pwdLen >= 20;
        if (pwdLenBad) {
            return String.format("Incorrect length of password, expected length to be less than 20. But given %d", pwdLen);
        } else if (!pwdMatch) {
            return "Error! Passwords must match each other";
        }
        return "Something is wrong with password!";
    }
}
