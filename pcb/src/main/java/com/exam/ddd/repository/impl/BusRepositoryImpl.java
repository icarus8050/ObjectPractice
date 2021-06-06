package com.exam.ddd.repository.impl;

import com.exam.ddd.domain.Bus;
import com.exam.ddd.repository.BusRepository;

import java.util.HashMap;
import java.util.Map;

public class BusRepositoryImpl implements BusRepository {
    private Map<Long, Bus> dataMap;
    private Long idSequence;

    public BusRepositoryImpl() {
        this.dataMap = new HashMap<Long, Bus>();
        this.idSequence = 1L;
    }

    public Bus findById(Long id) {
        return dataMap.get(id);
    }

    public void save(Bus bus) {
        dataMap.put(idSequence++, bus);
    }
}
