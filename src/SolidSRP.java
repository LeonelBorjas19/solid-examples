import interfaces.OpenClosed;

public class SolidSRP implements OpenClosed {

    private final String emailToFilter;

    public SolidSRP(String emailToFilter) {
        this.emailToFilter = emailToFilter;
    }


    @Override
    public boolean filter(String email) {
        return email.equals(emailToFilter);
    }
}
