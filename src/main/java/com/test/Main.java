package com.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;
import com.test.domain.School;
import com.test.module.MySQLModule;
import com.test.service.ISchoolService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(List.of(new MySQLModule()));
        ISchoolService schoolService = injector.getInstance(Key.get(ISchoolService.class, Names.named("mysql")));
        School school = new School();
        school.setAddress("地球");
        school.setName("地球大学");
        schoolService.insertSchool(school);
    }
}