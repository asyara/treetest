package com.example.treetest.persistance.repository;

import com.example.treetest.persistance.entity.AdjacencyNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<AdjacencyNode, Long> {

    @Override
    Optional<AdjacencyNode> findById(Long aLong);
}
