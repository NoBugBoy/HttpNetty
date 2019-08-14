package server.utils;

import com.google.inject.Guice;
import com.google.inject.Injector;
import server.GModel;
/**
 * @author yujian
 * @email 754369677@qq.com
 * 依赖注入器工具
 */
public class ServiceInjector {
    private static Injector injector;
    private ServiceInjector(){}
    public static void bindInjector(Injector instance){
        injector =instance;
    }
    public static Injector get(){
        if(injector == null){
            injector = Guice.createInjector(new GModel());
        }
        return injector;
    }
    public static <T> T getService(Class<T> service){
        if(injector != null){
            T instance = injector.getInstance(service);
            return instance;
        }else{
            injector = Guice.createInjector(new GModel());
            T instance = injector.getInstance(service);
            return instance;
        }

    }
}
