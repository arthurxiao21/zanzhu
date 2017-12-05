package com.zanzhu.mapper;

import com.zanzhu.pojo.ZanzhuActivity;
import com.zanzhu.pojo.ZanzhuActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZanzhuActivityMapper {
    int countByExample(ZanzhuActivityExample example);

    int deleteByExample(ZanzhuActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(ZanzhuActivity record);

    int insertSelective(ZanzhuActivity record);

    List<ZanzhuActivity> selectByExampleWithBLOBs(ZanzhuActivityExample example);

    List<ZanzhuActivity> selectByExample(ZanzhuActivityExample example);

    ZanzhuActivity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") ZanzhuActivity record, @Param("example") ZanzhuActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") ZanzhuActivity record, @Param("example") ZanzhuActivityExample example);

    int updateByExample(@Param("record") ZanzhuActivity record, @Param("example") ZanzhuActivityExample example);

    int updateByPrimaryKeySelective(ZanzhuActivity record);

    int updateByPrimaryKeyWithBLOBs(ZanzhuActivity record);

    int updateByPrimaryKey(ZanzhuActivity record);
}