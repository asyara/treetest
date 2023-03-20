package com.example.treetest.persistance.repository;

import com.example.treetest.persistance.entity.MaterializedPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterializedPathRepository extends JpaRepository<MaterializedPath, Long> {
}
