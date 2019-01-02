package az.seyidkanan.mvp.login;

import android.support.annotation.Nullable;

public class LoginActivityPresenter implements LoginActivityMVP.Presenter {

    @Nullable
    private LoginActivityMVP.View view;

    private LoginActivityMVP.Model model;

    public LoginActivityPresenter(LoginActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setCurrentView(LoginActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void onClickLoginButton() {
        if (view != null) {
            if (view.getName().trim().length() == 0 || view.getSurname().trim().length() == 0) {
                view.showInputError();
            } else {
                model.createUser(view.getName(), view.getSurname());
                view.showUserSavedMessage();
            }
        }
    }

    @Override
    public void getCurrentUser() {
        if (view != null) {
            User user = model.getUser();
            if (user == null) {
                view.showUserNotAviable();
            } else {
                view.setName(user.getName());
                view.setSurname(user.getSurname());
            }
        }
    }

}
