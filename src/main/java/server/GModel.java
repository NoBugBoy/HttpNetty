package server;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import service.UserService;
import service.impl.UserServiceImpl;

public class GModel extends AbstractModule{
    @Override
    protected void configure() {
        bind(UserService.class).to(UserServiceImpl.class).in(Scopes.SINGLETON);
    }
}
