package com.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/30.
 */
@Controller
public class CustomerController {

    @RequestMapping(value = "/index")
    public ModelAndView index(HttpServletRequest request){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("name", "mmq");
        return new ModelAndView("index", "model", resultMap);
    }


}
