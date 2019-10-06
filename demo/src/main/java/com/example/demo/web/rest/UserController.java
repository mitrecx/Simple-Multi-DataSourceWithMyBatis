package com.example.demo.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.mapper.cluster.d460.DUserMapper;
import com.example.demo.mapper.master.SUserMapper;
import com.example.demo.service.TestDService;
import com.example.demo.service.TestSService;

@RestController
public class UserController {
    @Autowired
    DUserMapper dUserMapper;
    @Autowired
    TestDService testDService;
    
    @Autowired
    SUserMapper sUserMapper;
    @Autowired
    TestSService testSService;
    
    

    @RequestMapping("/testd/add")
    public void addD(@RequestBody User user) {
        dUserMapper.add(user);
        System.out.println("新增成功.");
    }

    @RequestMapping("/testd/del")
    public String delD(@RequestBody List<User> list) {
        return "" + testDService.del(list);
    }
    @RequestMapping("/tests/add")
    public void addS(@RequestBody User user) {
        sUserMapper.add(user);
        System.out.println("新增成功.");
    }
    
    @RequestMapping("/tests/del")
    public String delS(@RequestBody List<User> list) {
        return "" + testSService.del(list);
    }

}
