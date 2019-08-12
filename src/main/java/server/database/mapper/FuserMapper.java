package server.database.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import server.database.entity.Fuser;
import server.database.entity.FuserExample;

public interface FuserMapper {
    int countByExample(FuserExample example);

    int deleteByExample(FuserExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Fuser record);

    int insertSelective(Fuser record);

    List<Fuser> selectByExample(FuserExample example);

    Fuser selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Fuser record, @Param("example") FuserExample example);

    int updateByExample(@Param("record") Fuser record, @Param("example") FuserExample example);

    int updateByPrimaryKeySelective(Fuser record);

    int updateByPrimaryKey(Fuser record);
}