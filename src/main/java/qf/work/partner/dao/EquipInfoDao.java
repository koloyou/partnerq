package qf.work.partner.dao;

import qf.work.partner.entity.EquipInfo;

public interface EquipInfoDao {
    int deleteByPrimaryKey(Integer equipId);

    int insert(EquipInfo record);

    int insertSelective(EquipInfo record);

    EquipInfo selectByPrimaryKey(Integer equipId);

    int updateByPrimaryKeySelective(EquipInfo record);

    int updateByPrimaryKey(EquipInfo record);
}