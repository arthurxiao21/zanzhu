package com.zanzhu.mapper;

import com.zanzhu.pojo.ZanzhuAdmin;
import com.zanzhu.pojo.ZanzhuAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZanzhuAdminMapper {
    int countByExample(ZanzhuAdminExample example);

    int deleteByExample(ZanzhuAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(ZanzhuAdmin record);

    int insertSelective(ZanzhuAdmin record);

    List<ZanzhuAdmin> selectByExample(ZanzhuAdminExample example);

    ZanzhuAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") ZanzhuAdmin record, @Param("example") ZanzhuAdminExample example);

    int updateByExample(@Param("record") ZanzhuAdmin record, @Param("example") ZanzhuAdminExample example);

    int updateByPrimaryKeySelective(ZanzhuAdmin record);

    int updateByPrimaryKey(ZanzhuAdmin record);
}