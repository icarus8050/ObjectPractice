package com.exam.pcb.repository.impl;

import com.exam.pcb.domain.Net;
import com.exam.pcb.repository.NetRepository;

import java.util.HashMap;
import java.util.Map;

public class NetRepositoryImpl implements NetRepository {
    private Map<Long, Net> dataMap;
    private Long idSequence;

    public NetRepositoryImpl() {
        this.dataMap = new HashMap<Long, Net>();
        this.idSequence = 1L;
    }

    public Net findById(Long id) {
        return dataMap.get(id);
    }

    public void save(Net net) {
        dataMap.put(idSequence++, net);
    }
}
