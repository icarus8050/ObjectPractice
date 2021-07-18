package com.exam.pcb.repository;

import com.exam.pcb.domain.Bus;

public interface BusRepository {
    Bus findById(Long id);
    void save(Bus bus);
}
