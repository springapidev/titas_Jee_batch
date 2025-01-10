package com.alltimeschool.module01.corecomponents;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String fetchData() {
        return "Data from MyRepository";
    }
}
