package az.seyidkanan.mvp.root;

import javax.inject.Singleton;

import az.seyidkanan.mvp.login.LoginActivity;
import az.seyidkanan.mvp.login.LoginModule;
import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {
    void inject(LoginActivity target);
}
