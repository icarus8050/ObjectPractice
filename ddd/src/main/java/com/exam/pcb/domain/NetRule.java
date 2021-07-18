package com.exam.pcb.domain;

public class NetRule implements LayoutRule {
    private String type;
    private Integer parameter;

    private NetRule(String type, Integer parameter) {
        this.type = type;
        this.parameter = parameter;
    }

    public static NetRule create(String type, Integer parameter) {
        return new NetRule(type, parameter);
    }

    public String getType() {
        return type;
    }

    public Integer getParameter() {
        return parameter;
    }
}
