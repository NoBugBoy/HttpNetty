package controller;

import com.google.inject.Singleton;
import server.NettyRequestMethod;
import server.anno.NettyRequestBody;
import server.anno.NettyRequestMapping;
import server.anno.NettyRequestParam;
import server.anno.NettyRestController;
import database.entity.TUser;
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

    @NettyRequestMapping(value = "/findByid",method = NettyRequestMethod.GET)
    public ResponseData findById(@NettyRequestParam(value = "id") Integer id,@NettyRequestParam(value = "name",required = false) String name){
        TUser userById = userService.findUserById(id);
        ResponseData responseData = new ResponseData(userById);
        return responseData;
    }

    @NettyRequestMapping(value = "/find",method = NettyRequestMethod.POST)
    public ResponseData findUser(){
        long random =  (long)(Math.random()*999)+1;
        TUser userById = userService.findUserById((int) random);

        ResponseData responseData = new ResponseData(userById);
        return responseData;
    }
    @NettyRequestMapping(value = "/add",method =  {NettyRequestMethod.POST})
    public ResponseData addUser(@NettyRequestBody TUser user){
        userService.save(user);
        return new ResponseData();

    }
    //只有这个路径才是上传文件和@NettyRestController上的路径无关
    @NettyRequestMapping(value = "/file/upload",method =  {NettyRequestMethod.POST})
    public String upload(){
        return "";
    }
}
