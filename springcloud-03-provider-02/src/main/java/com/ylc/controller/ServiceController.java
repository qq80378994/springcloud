package com.ylc.controller;

import com.ylc.pojo.Student;
import com.ylc.service.serviceApi;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ServiceController implements serviceApi {

    @Override
    public List<String> testFeign() {
        return Arrays.asList("测试Openfeign", "此为返回结果");
    }

    @Override
    public Student getMultiParams(Integer age, String name) {
        System.out.println("getMultiParams method run, parameters is [ age : " + age + " ; name : " + name + " ]");
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        return student;
    }

    @Override
    public Student postMultiParams(Integer age, String name) {
        System.out.println("postMultiParams method run, parameters is [ age : " + age + " ; name : " + name + " ]");
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        return student;
    }

    @Override
    public Student postObjectParam(Student pojo) {
        System.out.println("postObjectParam method run, parameters is" +pojo);
        return pojo;
    }
}
