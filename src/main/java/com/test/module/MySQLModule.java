package com.test.module;

import com.google.inject.PrivateModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import com.test.service.ISchoolService;
import com.test.service.impl.SchoolServiceImpl;
import org.mybatis.guice.XMLMyBatisModule;

public class MySQLModule extends PrivateModule {
    @Override
    protected void configure() {
        install(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                setEnvironmentId("mysql");
                setClassPathResource("mybatis-config-mysql.xml");
            }
        });
        bind(ISchoolService.class).annotatedWith(Names.named("mysql")).to(SchoolServiceImpl.class).in(Scopes.SINGLETON);
        expose(ISchoolService.class).annotatedWith(Names.named("mysql"));
    }
}
