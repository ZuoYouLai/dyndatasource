package com.example.dyndatasource.mapper;

import com.example.dyndatasource.domain.SubCustomers;
import com.example.dyndatasource.domain.SubCustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubCustomersMapper {
    long countByExample(SubCustomersExample example);

    int deleteByExample(SubCustomersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubCustomers record);

    int insertSelective(SubCustomers record);

    List<SubCustomers> selectByExampleWithBLOBs(SubCustomersExample example);

    List<SubCustomers> selectByExample(SubCustomersExample example);

    SubCustomers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubCustomers record, @Param("example") SubCustomersExample example);

    int updateByExampleWithBLOBs(@Param("record") SubCustomers record, @Param("example") SubCustomersExample example);

    int updateByExample(@Param("record") SubCustomers record, @Param("example") SubCustomersExample example);

    int updateByPrimaryKeySelective(SubCustomers record);

    int updateByPrimaryKeyWithBLOBs(SubCustomers record);

    int updateByPrimaryKey(SubCustomers record);
}