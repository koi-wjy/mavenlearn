package com.maven;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //生成每一个成员变量的get、set方法，以及toString、hashCode
@AllArgsConstructor //有参构造
@NoArgsConstructor  //无参构造
public class User {
    private Integer id;
    private String username;
    private String password;

}
