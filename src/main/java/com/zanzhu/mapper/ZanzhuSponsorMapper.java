package com.zanzhu.mapper;

import com.zanzhu.pojo.ZanzhuSponsor;
import com.zanzhu.pojo.ZanzhuSponsorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZanzhuSponsorMapper {
    int countByExample(ZanzhuSponsorExample example);

    int deleteByExample(ZanzhuSponsorExample example);

    int deleteByPrimaryKey(Integer sponsorId);

    int insert(ZanzhuSponsor record);

    int insertSelective(ZanzhuSponsor record);

    List<ZanzhuSponsor> selectByExampleWithBLOBs(ZanzhuSponsorExample example);

    List<ZanzhuSponsor> selectByExample(ZanzhuSponsorExample example);

    ZanzhuSponsor selectByPrimaryKey(Integer sponsorId);

    int updateByExampleSelective(@Param("record") ZanzhuSponsor record, @Param("example") ZanzhuSponsorExample example);

    int updateByExampleWithBLOBs(@Param("record") ZanzhuSponsor record, @Param("example") ZanzhuSponsorExample example);

    int updateByExample(@Param("record") ZanzhuSponsor record, @Param("example") ZanzhuSponsorExample example);

    int updateByPrimaryKeySelective(ZanzhuSponsor record);

    int updateByPrimaryKeyWithBLOBs(ZanzhuSponsor record);

    int updateByPrimaryKey(ZanzhuSponsor record);
}