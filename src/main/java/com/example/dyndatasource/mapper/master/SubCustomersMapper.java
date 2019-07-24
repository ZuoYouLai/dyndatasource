package com.example.dyndatasource.mapper.master;

import com.example.dyndatasource.domain.SubCustomers;
import com.example.dyndatasource.domain.SubCustomersExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    @Select("SELECT * FROM sub_merchant_id_customers")
    List<SubCustomers> list();
}