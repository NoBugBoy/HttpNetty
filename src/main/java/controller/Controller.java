package controller;

import org.apache.ibatis.session.SqlSession;
import server.NettyRequestMethod;
import server.anno.NettyRequestBody;
import server.anno.NettyRequestMapping;
import server.anno.NettyRestController;
import server.database.entity.Fuser;
import server.database.mapper.FuserMapper;
import server.utils.SqlSessionUtils;

@NettyRestController(value = "/user")
public class Controller {
    @NettyRequestMapping(value = "/add",method =  {NettyRequestMethod.POST})
    public Fuser findUser(@NettyRequestBody Fuser user){
        try(SqlSession session = SqlSessionUtils.openTransaction()){
            FuserMapper mapper = session.getMapper(FuserMapper.class);
            Fuser fuser1 = mapper.selectByPrimaryKey(2);
            fuser1.setFid(null);
            fuser1.setFloginname("0000");
            int insert = mapper.insert(fuser1);
            System.out.println(insert);
            session.commit();
           // int x = 2/0;
            return fuser1;
        }catch (Exception e){
            e.printStackTrace();
        }
       return null;
    }
}
