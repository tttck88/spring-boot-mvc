package com.example.springbootmvc.service;

import com.example.springbootmvc.mapper.TestMapper;
import com.example.springbootmvc.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    public TestMapper testMapper;

    public List<TestVo> selectTest() {
        return testMapper.selectTest();
    }
}
