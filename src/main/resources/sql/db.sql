create database test;
use test;
create table if not exists school(
                                     id int auto_increment,
                                     name varchar(256),
    address varchar(256),
    primary key (id)
    )ENGINE=InnoDB CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='School表';
create table if not exists classroom(
                                        id int auto_increment,
                                        name varchar(256),
    school_id int,
    capacity int,
    primary key (id)
    )ENGINE=InnoDB CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='Classroom表';
