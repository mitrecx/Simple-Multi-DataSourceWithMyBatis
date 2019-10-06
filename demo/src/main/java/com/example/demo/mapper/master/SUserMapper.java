package com.example.demo.mapper.master;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface SUserMapper {
    void add(User user);

    int del(User user);
}
