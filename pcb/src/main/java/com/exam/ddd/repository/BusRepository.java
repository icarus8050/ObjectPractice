package com.exam.ddd.repository;

import com.exam.ddd.domain.Bus;

public interface BusRepository {
    Bus findById(Long id);
    void save(Bus bus);
}
