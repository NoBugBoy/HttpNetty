package service.impl;

import com.google.inject.Singleton;
import org.apache.ibatis.session.SqlSession;
import server.database.entity.TUser;
import server.database.mapper.TUserMapper;
import server.utils.SqlSessionUtils;
import service.UserService;
@Singleton
public class UserServiceImpl implements UserService {

    @Override
    public   void save(TUser tUser) {
        try(SqlSession sqlSession= SqlSessionUtils.openTransaction()) {
            TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
            mapper.insert(tUser);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public TUser findUserById(Integer id) {
        try(SqlSession sqlSession= SqlSessionUtils.openQuery()) {
            TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
            TUser tUser = mapper.selectByPrimaryKey(id);
            return tUser;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
