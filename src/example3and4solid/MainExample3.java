package example3and4solid;

public class MainExample3 {
    public static void main(String[] args) {
        BirdWatcher watcher = new BirdWatcher();

        // Creando un gorrión que puede volar
        Fly sparrow = new Sparrow();
        watcher.watchBirdFly(sparrow);

        // Creando un pingüino, que no puede volar
        Penguin penguin = new Penguin();
        penguin.swim();
    }
}
