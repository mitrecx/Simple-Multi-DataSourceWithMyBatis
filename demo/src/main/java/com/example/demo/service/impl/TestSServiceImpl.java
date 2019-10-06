package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
import com.example.demo.mapper.master.SUserMapper;
import com.example.demo.service.TestSService;

@Service
public class TestSServiceImpl implements TestSService {

    @Autowired
    SUserMapper testSMapper;

    @Transactional("sTransactionManager")
    @Override
    public int del(List<User> list) {
        int cnt = 0;
        for (User user : list) {
            cnt = testSMapper.del(user) + cnt;
            throw new RuntimeException("cx");
        }
        System.out.println("共删除数据 " + cnt + " 条");
        return cnt;
    }

}
