package server.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
/**
 * @author yujian
 * @email 754369677@qq.com
 * 数据库事务连接
 */
public class SqlSessionUtils {
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSessionUtils(){}
    public static void bindSqlSessionFactory(SqlSessionFactory session){
        sqlSessionFactory =session;
    }
    public static SqlSession openQuery(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
    //增删改
    public static SqlSession openTransaction(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}
