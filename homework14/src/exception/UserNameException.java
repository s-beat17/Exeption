package exception;

public class UserNameException extends UserValidException{
    public UserNameException() {
        System.err.println("Поле Name не должно быть пустым или содержать числа или специальные символы");
    }
}
