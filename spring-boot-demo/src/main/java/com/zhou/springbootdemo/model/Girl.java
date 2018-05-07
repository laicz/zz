/**
 * Date:     2018/5/722:20
 * AUTHOR:   Administrator
 */
package com.zhou.springbootdemo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "girl")
@Component
public class Girl {

    private String cupSize;

    private Integer age;

    private String sex;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "cupSize='" + cupSize + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
