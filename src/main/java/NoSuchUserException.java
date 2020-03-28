public class NoSuchUserException extends Exception {

    private String whyException;

    public NoSuchUserException(int id, int whyException) {
        super("User " + id + " does not exist");
        if (whyException == 1) {
            System.out.print("The id you enter is to low");
        } else if (whyException == 2) {
            System.out.print("The id you entered is to high");
        }
    }
}
