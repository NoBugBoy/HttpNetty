package controller;

import server.NettyRequestMethod;
import server.anno.NettyRequestUri;
import server.anno.NettyRestController;

import java.util.Map;
@NettyRestController(value = "/user")
public class Controller {
    @NettyRequestUri(value = "/findUser",method =  {NettyRequestMethod.GET,NettyRequestMethod.POST})
    public String findUser(Map<String,String> map){
        String key = map.get("key");
        if("123".equals(key)){
            return "我是123";
        }else {
            return "我是其他";
        }
    }
}
