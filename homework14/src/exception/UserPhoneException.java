package exception;

public class UserPhoneException extends UserValidException{
    public UserPhoneException() {
        System.err.println("Поле Phone должен содержать только цифры, начинаться с ноля и должен содержать 10 цифр: 0991112233");
    }
}
