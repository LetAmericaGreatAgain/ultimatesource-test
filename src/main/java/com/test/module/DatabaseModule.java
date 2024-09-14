package com.test.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import com.test.domain.Classroom;
import com.test.service.ISchoolService;
import com.test.service.impl.SchoolServiceImpl;
import org.mybatis.guice.XMLMyBatisModule;

public class DatabaseModule extends AbstractModule {
    @Override
    protected void configure() {
        super.configure();
        install(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                setEnvironmentId("mysql");
                setClassPathResource("mybatis-config-mysql.xml");
            }
        });
        bind(ISchoolService.class).annotatedWith(Names.named("mysql")).to(SchoolServiceImpl.class).in(Scopes.SINGLETON);
    }
}
