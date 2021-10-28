package qf.work.partner.dao;

import qf.work.partner.entity.GEmployees;

public interface GEmployeesDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(GEmployees record);

    int insertSelective(GEmployees record);

    GEmployees selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(GEmployees record);

    int updateByPrimaryKey(GEmployees record);
}