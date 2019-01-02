package az.seyidkanan.mvp.login;

public class LoginModel implements LoginActivityMVP.Model {

    private LoginRepository loginRepository;

    public LoginModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void createUser(String name, String surname) {
        loginRepository.saveUser(new User(name, surname));
    }

    @Override
    public User getUser() {
        return loginRepository.getUser();
    }


}
