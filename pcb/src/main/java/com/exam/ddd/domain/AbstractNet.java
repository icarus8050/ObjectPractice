package com.exam.ddd.domain;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractNet {
    private String name;
    private Set<LayoutRule> rules;

    public AbstractNet(String name) {
        this.name = name;
        this.rules = new HashSet<LayoutRule>();
    }

    public void assignRule(LayoutRule rule) {
        rules.add(rule);
    }

    public Set<LayoutRule> assignedRules() {
        return rules;
    }
}
