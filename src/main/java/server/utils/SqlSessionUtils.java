package server.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class SqlSessionUtils {
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSessionUtils(){}
    public static void bindSqlSessionFactory(SqlSessionFactory session){
        sqlSessionFactory =session;
    }
    public static SqlSession getSession(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
