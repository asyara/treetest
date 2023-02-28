package com.example.treetest.persistance.repository;

import com.example.treetest.persistance.entity.AdjacencyNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdjacencyNodeRepository extends JpaRepository<AdjacencyNode, Long> {

    @Override
    List<AdjacencyNode> findAll();

    @Override
    Optional<AdjacencyNode> findById(Long aLong);
}
