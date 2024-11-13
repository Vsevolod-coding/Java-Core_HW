package seminar_tasks.Task_1;
/*
1. Создать статический метод который принимает на вход три
параметра: login, password и confirmPassword.
2. Длина login должна быть меньше 20 символов. Если login не
соответствует этим требованиям, необходимо выбросить
WrongLoginException.
3. Длина password должна быть меньше 20 символов. Также password
и confirmPassword должны быть равны. Если password не
соответствует этим требованиям, необходимо выбросить
WrongPasswordException.
4. WrongPasswordException и WrongLoginException - пользовательские
классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в
конструктор класса Exception.
5. В основном классе программы необходимо по-разному обработать
исключения.
6. Метод возвращает true, если значения верны или false в другом
случае.
*/
public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(login("Seva-123-007","qwertY-007_2006","qwertY-007_2006"));
    }

    private static boolean login(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException(login.length());
        }
        if (password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException(password.length(), password.equals(confirmPassword));
        }
        return true;
    }
}