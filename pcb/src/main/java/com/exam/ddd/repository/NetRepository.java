package com.exam.ddd.repository;

import com.exam.ddd.domain.Net;

public interface NetRepository {
    Net findById(Long id);
    void save(Net net);
}
