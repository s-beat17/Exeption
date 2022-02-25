package pack;

public class C extends B{
    @Override
    public void start() throws ExA {
        throw new ExC();
    }
}
