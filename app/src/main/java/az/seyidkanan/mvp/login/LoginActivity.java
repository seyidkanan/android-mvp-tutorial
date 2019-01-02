package az.seyidkanan.mvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import az.seyidkanan.mvp.R;
import az.seyidkanan.mvp.root.App;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View {

    @Inject
    LoginActivityMVP.Presenter presenter;


    @BindView(R.id.editTextName)
    EditText editTextName;
    @BindView(R.id.editTextSurname)
    EditText editTextSurname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        ((App) getApplication()).getApplicationComponent().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setCurrentView(this);
    }

    @OnClick(R.id.button)
    public void onClickLoginButton() {
        presenter.onClickLoginButton();
    }

    @Override
    public String getName() {
        return editTextName.getText().toString();
    }

    @Override
    public String getSurname() {
        return editTextSurname.getText().toString();
    }

    @Override
    public void showUserNotAviable() {
        Toast.makeText(this, "User not available", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "Input not correct", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(this, "User data saved", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setName(String name) {
        editTextName.setText(name);
    }

    @Override
    public void setSurname(String surname) {
        editTextSurname.setText(surname);
    }
}
