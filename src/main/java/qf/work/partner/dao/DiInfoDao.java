package qf.work.partner.dao;

import qf.work.partner.entity.DiInfo;

public interface DiInfoDao {
    int deleteByPrimaryKey(Integer diId);

    int insert(DiInfo record);

    int insertSelective(DiInfo record);

    DiInfo selectByPrimaryKey(Integer diId);

    int updateByPrimaryKeySelective(DiInfo record);

    int updateByPrimaryKeyWithBLOBs(DiInfo record);

    int updateByPrimaryKey(DiInfo record);
}