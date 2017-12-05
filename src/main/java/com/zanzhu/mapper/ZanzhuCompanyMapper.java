package com.zanzhu.mapper;

import com.zanzhu.pojo.ZanzhuCompany;
import com.zanzhu.pojo.ZanzhuCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZanzhuCompanyMapper {
    int countByExample(ZanzhuCompanyExample example);

    int deleteByExample(ZanzhuCompanyExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(ZanzhuCompany record);

    int insertSelective(ZanzhuCompany record);

    List<ZanzhuCompany> selectByExample(ZanzhuCompanyExample example);

    ZanzhuCompany selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") ZanzhuCompany record, @Param("example") ZanzhuCompanyExample example);

    int updateByExample(@Param("record") ZanzhuCompany record, @Param("example") ZanzhuCompanyExample example);

    int updateByPrimaryKeySelective(ZanzhuCompany record);

    int updateByPrimaryKey(ZanzhuCompany record);
}