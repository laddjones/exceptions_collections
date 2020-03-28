import java.util.Arrays;
public class UserDao {
    private String[] users;
    private int counter;

    public UserDao(String[] users) {
        this.users = Arrays.copyOf(users, users.length);
    }

    public String getUser(int id) throws Exception {
        try {
            throwsIsOutOfBOunds(id);
        } catch (ArrayIndexOutOfBoundsException e1) {
            e1.getMessage();
            NoSuchUserException e2 = new NoSuchUserException(id, counter);
            System.out.print(e2.getMessage());
        }

        // Catch the ArrayIndexOutOfBoundsException
        // Re-throw a NoSuchUserException
        return users[id];
    }
    public void throwsIsOutOfBOunds(int thereID) throws ArrayIndexOutOfBoundsException {
        if (this.idOutOfBounds(thereID) == 1) {
            counter = 1;
            throw new ArrayIndexOutOfBoundsException();
        }
        else if (this.idOutOfBounds(thereID) == 2) {
            counter = 2;
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int idOutOfBounds(int thereID) {
        if (thereID < 0) {
            return 1;
        } else if (thereID > users.length) {
            return 2;
        }
        else {
            return 0;
        }
    }

    public void throwsnoSuchuserException(int id, int reason) throws NoSuchUserException {
        throw new NoSuchUserException(id, reason);
    }

}
