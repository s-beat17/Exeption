package exception;

public class UserMailException extends UserValidException {
    public UserMailException() {
        System.err.println("Email должна содержать 1 или более символов до @, 1 или более символов от собачки до точки,\n"
                + " и не меньше двух символов после точки, почта не должна содержать специальных символов, кроме: _ @ .");
    }
}
