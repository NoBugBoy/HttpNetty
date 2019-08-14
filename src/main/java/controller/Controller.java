package controller;

import com.google.inject.Singleton;
import server.NettyRequestMethod;
import server.anno.NettyRequestBody;
import server.anno.NettyRequestMapping;
import server.anno.NettyRestController;
import server.database.entity.TUser;
import server.utils.ResponseData;
import server.utils.ServiceInjector;
import service.UserService;

@Singleton
@NettyRestController(value = "/user")
public class Controller {
    //需要注入的service
    private UserService userService;
    {
        userService = ServiceInjector.getService(UserService.class);
    }
    @NettyRequestMapping(value = "/add",method =  {NettyRequestMethod.POST})
    public ResponseData findUser(@NettyRequestBody TUser user){
//            if(Cache.cache.get(user.getFid())==null){
//                Fuser userById = userService.findUserById(Long.valueOf(user.getFid()));
//                Cache.cache.put(user.getFid(),userById);
//                return userById;
//            }else{
//                return Cache.cache.get(user.getFid());
        //}
        TUser tUser = new TUser();
        long random =  (long)(Math.random()*999)+1;
        tUser.setUsername(String.valueOf(random));
            userService.save(tUser);

        return new ResponseData();

    }
    //只有这个路径才是上传文件和@NettyRestController上的路径无关
    @NettyRequestMapping(value = "/file/upload",method =  {NettyRequestMethod.POST})
    public String upload(){
        return "";
    }
}
