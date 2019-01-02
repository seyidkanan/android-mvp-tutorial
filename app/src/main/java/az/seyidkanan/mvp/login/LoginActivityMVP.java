package az.seyidkanan.mvp.login;

public interface LoginActivityMVP {

    interface View {

        String getName();

        String getSurname();


        void showUserNotAviable();

        void showInputError();

        void showUserSavedMessage();


        void setName(String name);

        void setSurname(String surname);


    }

    interface Presenter {

        void setCurrentView(LoginActivityMVP.View view);

        void onClickLoginButton();

        void getCurrentUser();

    }

    interface Model {

        void createUser(String name, String surname);

        User getUser();

    }

}
