package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
import com.example.demo.mapper.cluster.d460.DUserMapper;
import com.example.demo.service.TestDService;

@Service
public class TestDServiceImpl implements TestDService {

    @Autowired
    DUserMapper testDMapper;

    @Transactional("dTransactionManager")
    @Override
    public int del(List<User> list) {
        int cnt = 0;
        for (User user : list) {
            cnt = testDMapper.del(user) + cnt;
            //throw new RuntimeException("cx");
        }
        System.out.println("共删除数据 " + cnt + " 条");
        return cnt;
    }

}
