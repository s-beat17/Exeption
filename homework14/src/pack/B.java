package pack;

public class B extends A{
    @Override
    public void start() throws ExA {
        throw new ExB();
    }
}
