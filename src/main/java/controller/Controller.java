package controller;

import server.NettyRequestMethod;
import server.anno.NettyRequestBody;
import server.anno.NettyRequestUri;
import server.anno.NettyRestController;
@NettyRestController(value = "/user")
public class Controller {
    @NettyRequestUri(value = "/add",method =  {NettyRequestMethod.POST})
    public User findUser(@NettyRequestBody User user){
        System.out.println(user.getPassword());
        System.out.println(user.getUserName());
        return user;
    }
}
