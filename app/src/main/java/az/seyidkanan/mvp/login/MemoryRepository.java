package az.seyidkanan.mvp.login;

public class MemoryRepository implements LoginRepository {

    private User user;

    @Override
    public User getUser() {

        if (user == null) {
            user = new User("Kanan", "Bagirov");
        }

        return user;
    }

    @Override
    public void saveUser(User user) {
        if (user == null) {
            user = getUser();
        }

        this.user = user;
    }
}
