package az.seyidkanan.mvp.login;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model) {
        return new LoginActivityPresenter(model);
    }

    @Provides
    LoginActivityMVP.Model provideLoginActivityModel(LoginRepository repository) {
        return new LoginModel(repository);
    }

    @Provides
    LoginRepository provideLoginActivityRepo() {
        return new MemoryRepository();
    }

}
