package com.example.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author didi
 * @Date 2021/2/3
 */
@Data //GET,SET,ToString，有参，无参构造
public class Teacher {
    private int id;
    private String name;
    private String email;
    //一个老师多个学生
    private List<Student> students;
}
