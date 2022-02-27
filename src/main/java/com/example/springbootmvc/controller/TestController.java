package com.example.springbootmvc.controller;

import com.example.springbootmvc.service.TestService;
import com.example.springbootmvc.vo.TestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @RequestMapping("/test")
    public ModelAndView test() throws Exception {
        ModelAndView mav = new ModelAndView("test");

        List<TestVo> testList = testService.selectTest();
        mav.addObject(testList);

        return mav;
    }
}
