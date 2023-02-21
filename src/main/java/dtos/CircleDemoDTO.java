package dtos;

import entities.CircleDemo;

import java.util.Set;

public class CircleDemoDTO {
    private String name;
    private String renameMe;

    public CircleDemoDTO(CircleDemo circleDemo) {
        this.name = circleDemo.getName();
        this.renameMe = circleDemo.getRenameMe().getDummyStr1() + " " + circleDemo.getRenameMe().getDummyStr2();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRenameMe() {
        return renameMe;
    }

    public void setRenameMe(String renameMe) {
        this.renameMe = renameMe;
    }
}
