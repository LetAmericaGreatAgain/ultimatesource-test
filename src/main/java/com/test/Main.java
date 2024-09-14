package com.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;
import com.test.domain.Classroom;
import com.test.domain.School;
import com.test.module.CommonModule;
import com.test.module.DatabaseModule;
import com.test.module.MySQLModule;
import com.test.service.ISchoolService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(List.of(new DatabaseModule()));
        ISchoolService schoolService = injector.getInstance(Key.get(ISchoolService.class, Names.named("mysql")));
        School school = new School();
        school.setAddress("school address");
        school.setName("school name");
        schoolService.insertSchool(school);
        /*Injector injector = Guice.createInjector(List.of(new CommonModule()));
        Classroom classroom = injector.getInstance(Classroom.class);
        System.out.println(classroom);*/
    }
}
