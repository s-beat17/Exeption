package pack;

public class NegativeValueException extends Exception {
    private int val;

    public NegativeValueException(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
