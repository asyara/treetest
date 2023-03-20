package com.example.treetest.persistance.repository;

import com.example.treetest.persistance.entity.AdjacencyNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdjacencyNodeRepository extends JpaRepository<AdjacencyNode, Long> {
}
