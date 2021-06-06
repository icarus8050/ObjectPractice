package com.exam.ddd.domain;

import java.util.HashSet;
import java.util.Set;

public class Net extends AbstractNet {
    private Long id;
    private Bus bus;

    public Net(String name) {
        super(name);
    }

    @Override
    public Set<LayoutRule> assignedRules() {
        Set<LayoutRule> result = new HashSet<LayoutRule>();
        result.addAll(super.assignedRules());
        result.addAll(bus.assignedRules());
        return result;
    }
}
