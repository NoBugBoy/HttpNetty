package controller;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import server.NettyRequestMethod;
import server.anno.NettyRequestBody;
import server.anno.NettyRequestUri;
import server.anno.NettyRestController;
import server.database.entity.Fuser;
import server.database.mapper.FuserMapper;
import server.utils.SqlSessionUtils;

@NettyRestController(value = "/user")
public class Controller {
    @NettyRequestUri(value = "/add",method =  {NettyRequestMethod.GET})
    public Fuser findUser(@NettyRequestBody Fuser user){
        try(SqlSession session = SqlSessionUtils.getSession()){
            FuserMapper mapper = session.getMapper(FuserMapper.class);
            Fuser fuser = mapper.selectByPrimaryKey(2);
            System.out.println(JSON.toJSONString(fuser));
            return fuser;
        }catch (Exception e){
            e.printStackTrace();
        }
       return null;
    }
}
