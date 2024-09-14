package com.test.module;

import com.google.inject.AbstractModule;
import com.test.domain.Classroom;

public class CommonModule extends AbstractModule {
    @Override
    protected void configure() {
        super.configure();
        Classroom classroom = new Classroom();
        classroom.setName("classroom");
        classroom.setCapacity(66);
        bind(Classroom.class).toInstance(classroom);
    }
}
