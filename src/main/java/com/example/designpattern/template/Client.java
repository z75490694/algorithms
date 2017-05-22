package com.example.designpattern.template;

/**
 * Created by WHZ on 2017/5/22.
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.prepareGotoSchool();

        Teacher teacher  = new Teacher();
        teacher.prepareGotoSchool();
    }
}
