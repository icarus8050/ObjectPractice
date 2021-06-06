package com.exam.ddd.domain;

public class NetRule implements LayoutRule {

    private String type;
    private Long parameter;

    private NetRule(String type, Long parameter) {
        this.type = type;
        this.parameter = parameter;
    }

    public static NetRule create(String type, Long parameter) {
        return new NetRule(type, parameter);
    }

    public String getType() {
        return null;
    }

    public Long getParameter() {
        return null;
    }
}
