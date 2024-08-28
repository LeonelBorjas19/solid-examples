import interfaces.OpenClosed;

public class Main {
    public static void main(String[] args) {
        OpenClosed emailFilter = new SolidSRP("2SOLID@2SOLID.com");

        boolean isMatch = emailFilter.filter("2SOLID@2SOLID.com");
        System.out.println("Is email a match? " + isMatch);

        isMatch = emailFilter.filter("2SOLID2@2SOLID..com");
        System.out.println("Is email a match? " + isMatch);
    }

}
