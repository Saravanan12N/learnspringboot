package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/")
    public String homePage(){
        return "<h1>Home Page</h1>";
    }

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1,"Learn AWS","in udemy"),
                new Course(2,"Learn SpringBoot","in udemy")
        );
    }

}
