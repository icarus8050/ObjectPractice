package com.exam.declarative;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<ContainerFeature> features;

    public Container() {
        this.features = new ArrayList<>();
    }

    public Container(List<ContainerFeature> features) {
        this.features = features;
    }

    public List<ContainerFeature> getFeatures() {
        return features;
    }
}
