package controller.cas;

import server.NettyRequestMethod;
import server.anno.NettyRequestUri;
import server.anno.NettyRestController;

import java.util.Map;

@NettyRestController(value = "/user")
public class Controller {
    @NettyRequestUri(value = "/getUser",method =  {NettyRequestMethod.GET,NettyRequestMethod.POST})
    public String findUser(Map<String,String> map){
        String key = map.get("key");
        if("123".equals(key)){
            return "123123123123";
        }else {
            return "32312312312";
        }
    }
}
