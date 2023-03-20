package com.example.treetest.persistance.repository;

import com.example.treetest.persistance.entity.NestedSetsTree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NestedSetsTreeRepository extends JpaRepository<NestedSetsTree, Long> {
}
