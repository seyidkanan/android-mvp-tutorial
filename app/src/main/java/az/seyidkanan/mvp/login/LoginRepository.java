package az.seyidkanan.mvp.login;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);

}
