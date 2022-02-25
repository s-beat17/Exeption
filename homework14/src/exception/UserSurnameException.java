package exception;

public class UserSurnameException extends UserValidException{
    public UserSurnameException() {
        System.err.println("Поле Surname не должно быть пустым или содержать числа или специальные символы");
    }
}
