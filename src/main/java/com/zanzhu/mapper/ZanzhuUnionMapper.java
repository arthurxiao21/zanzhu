package com.zanzhu.mapper;

import com.zanzhu.pojo.ZanzhuUnion;
import com.zanzhu.pojo.ZanzhuUnionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZanzhuUnionMapper {
    int countByExample(ZanzhuUnionExample example);

    int deleteByExample(ZanzhuUnionExample example);

    int deleteByPrimaryKey(Integer unionId);

    int insert(ZanzhuUnion record);

    int insertSelective(ZanzhuUnion record);

    List<ZanzhuUnion> selectByExample(ZanzhuUnionExample example);

    ZanzhuUnion selectByPrimaryKey(Integer unionId);

    int updateByExampleSelective(@Param("record") ZanzhuUnion record, @Param("example") ZanzhuUnionExample example);

    int updateByExample(@Param("record") ZanzhuUnion record, @Param("example") ZanzhuUnionExample example);

    int updateByPrimaryKeySelective(ZanzhuUnion record);

    int updateByPrimaryKey(ZanzhuUnion record);
}