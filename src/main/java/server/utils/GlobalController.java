package server.utils;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalController {

    private static Set<Class<?>> instance = new HashSet<>();
    private static Map<Class<?>,Method[]> instanceMethods= new ConcurrentHashMap<>();

    private GlobalController(){}

    public static Set<Class<?>> getInstance(){
        return instance;
    }
    public static void setInstance(Set<Class<?>> set){
        instance = set;
    }
    public static Method[] getMethods(Class<?> clazz){
        return instanceMethods.get(clazz);
    }
    public static void putInstanceMethods(Class<?> clazz,Method[] methods){
        instanceMethods.put(clazz,methods);
    }

}
