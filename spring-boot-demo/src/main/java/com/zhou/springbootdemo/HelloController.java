/**
 * Date:     2018/5/721:59
 * AUTHOR:   Administrator
 */
package com.zhou.springbootdemo;

import com.zhou.springbootdemo.model.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *M
 */
@RestController
public class HelloController {

    @Autowired
    private Girl girl;

    @RequestMapping(value="hello",method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot";
    }

    @RequestMapping("/girl")
    public String girl(){
        return girl.toString();
    }
}
