package com.exam.ddd.domain;

import java.util.HashSet;
import java.util.Set;

public class Bus extends AbstractNet {
    private Long id;
    private Set<Net> nets;

    public Bus(String name) {
        super(name);
        nets = new HashSet<>();
    }

    public void addNet(Net net) {
        nets.add(net);
        net.assignBus(this);
    }
}
