package com.example.InsertToDBFromCSV;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class ComponentRepository implements JpaRepository<ComponentEntity, Long> {
}
