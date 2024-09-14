package com.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Table{primaryKey:["id"], packageName: "com.test", author: "kanglitian"}
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {
    private Integer id;
    private String name;
    private Integer schoolId;
    private Integer capacity;
}
