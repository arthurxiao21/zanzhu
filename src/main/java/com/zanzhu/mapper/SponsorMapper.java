package com.zanzhu.mapper;

import com.zanzhu.pojo.Sponsor;
import com.zanzhu.pojo.SponsorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SponsorMapper {
    int countByExample(SponsorExample example);

    int deleteByExample(SponsorExample example);

    int deleteByPrimaryKey(Integer sponsorId);

    int insert(Sponsor record);

    int insertSelective(Sponsor record);

    List<Sponsor> selectByExampleWithBLOBs(SponsorExample example);

    List<Sponsor> selectByExample(SponsorExample example);

    Sponsor selectByPrimaryKey(Integer sponsorId);

    int updateByExampleSelective(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    int updateByExampleWithBLOBs(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    int updateByExample(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    int updateByPrimaryKeySelective(Sponsor record);

    int updateByPrimaryKeyWithBLOBs(Sponsor record);

    int updateByPrimaryKey(Sponsor record);
}