package example3and4solid;

public class Sparrow extends Bird implements Fly{
    @Override
    public void fly() {
        System.out.println("Sparrow can Flying high in the sky!");
    }
}
