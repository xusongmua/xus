package com.example.passenger.service.impl;

import com.example.passenger.entity.ItripOrderLinkUser;
import com.example.passenger.mapper.ItripOrderLinkUserMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.passenger.service.ItripOrderLinkUserService;

@Service
public class ItripOrderLinkUserServiceImpl implements ItripOrderLinkUserService{

    @Resource
    private ItripOrderLinkUserMapper itripOrderLinkUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return itripOrderLinkUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ItripOrderLinkUser record) {
        return itripOrderLinkUserMapper.insert(record);
    }

    @Override
    public int insertSelective(ItripOrderLinkUser record) {
        return itripOrderLinkUserMapper.insertSelective(record);
    }

    @Override
    public ItripOrderLinkUser selectByPrimaryKey(Long id) {
        return itripOrderLinkUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ItripOrderLinkUser record) {
        return itripOrderLinkUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ItripOrderLinkUser record) {
        return itripOrderLinkUserMapper.updateByPrimaryKey(record);
    }

}
