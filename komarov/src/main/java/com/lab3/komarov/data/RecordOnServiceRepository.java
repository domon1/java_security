package com.lab3.komarov.data;

import com.lab3.komarov.entity.RecordOnService;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecordOnServiceRepository extends CrudRepository<RecordOnService, Long> {
    // List<RecordOnService> findByDate(String date);
}
