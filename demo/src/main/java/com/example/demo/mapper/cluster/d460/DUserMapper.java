package com.example.demo.mapper.cluster.d460;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface DUserMapper {
    void add(User user);

    int del(User user);
}
