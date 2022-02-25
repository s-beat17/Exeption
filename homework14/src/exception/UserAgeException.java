package exception;

public class UserAgeException extends UserValidException{
    public UserAgeException() {
        System.err.println("Укажите правильно поле Age");
    }
}
