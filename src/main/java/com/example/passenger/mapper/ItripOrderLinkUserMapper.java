package com.example.passenger.mapper;

import com.example.passenger.entity.ItripOrderLinkUser;

public interface ItripOrderLinkUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItripOrderLinkUser record);

    int insertSelective(ItripOrderLinkUser record);

    ItripOrderLinkUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItripOrderLinkUser record);

    int updateByPrimaryKey(ItripOrderLinkUser record);
}