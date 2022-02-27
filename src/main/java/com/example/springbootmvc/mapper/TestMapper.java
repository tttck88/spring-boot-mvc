package com.example.springbootmvc.mapper;

import com.example.springbootmvc.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestVo> selectTest();
}
