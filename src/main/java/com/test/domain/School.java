package com.test.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Table{primaryKey:["id"], packageName: "com.test", author: "kanglitian"}
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    private Integer id;
    private String name;
    private String address;
}
