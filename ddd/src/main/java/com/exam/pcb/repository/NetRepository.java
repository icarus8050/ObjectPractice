package com.exam.pcb.repository;

import com.exam.pcb.domain.Net;

public interface NetRepository {
    Net findById(Long id);
    void save(Net net);
}
