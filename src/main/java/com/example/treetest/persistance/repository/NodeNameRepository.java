package com.example.treetest.persistance.repository;

import com.example.treetest.persistance.entity.NodeName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeNameRepository extends JpaRepository<NodeName, Long> {
}