package com.trendcore.apache.geode.learning.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;


@Region
public class Role {

    @Id
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
