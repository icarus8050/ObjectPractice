package com.exam.declarative;

import java.util.Objects;

public class ContainerFeature {
    public static ContainerFeature ARMORED = new ContainerFeature("ARMORED");
    public static ContainerFeature VENTILATED = new ContainerFeature("VENTILATED");

    private String code;

    public ContainerFeature(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContainerFeature that = (ContainerFeature) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
