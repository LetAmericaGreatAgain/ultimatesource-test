package com.test.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import com.test.domain.Classroom;
import com.test.service.ISchoolService;
import com.test.service.impl.SchoolServiceImpl;

public class DatabaseModule extends AbstractModule {
    @Override
    protected void configure() {
        super.configure();
        bind(ISchoolService.class).annotatedWith(Names.named("mysql")).to(SchoolServiceImpl.class).in(Scopes.SINGLETON);
    }
}
