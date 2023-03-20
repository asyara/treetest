package com.example.treetest.domain.service;

import com.example.treetest.persistance.entity.AdjacencyNode;
import com.example.treetest.persistance.entity.MaterializedPath;
import com.example.treetest.persistance.entity.NestedSetsTree;
import com.example.treetest.persistance.entity.NodeName;
import com.example.treetest.persistance.repository.AdjacencyNodeRepository;
import com.example.treetest.persistance.repository.MaterializedPathRepository;
import com.example.treetest.persistance.repository.NestedSetsTreeRepository;
import com.example.treetest.persistance.repository.NodeNameRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.System.currentTimeMillis;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class TreeService {

    private final AdjacencyNodeRepository adjacencyNodeRepository;
    private final NodeNameRepository nodeNameRepository;
    private final NestedSetsTreeRepository nestedSetsTreeRepository;
    private final MaterializedPathRepository materializedPathRepository;

    public void receiveAllData() {
        long startTime = currentTimeMillis();
        List<AdjacencyNode> adjacencyNodeList = adjacencyNodeRepository.findAll();
        long endTime = currentTimeMillis();
        System.out.println("adjacencyNodeList was received in " + (endTime - startTime) + " milliseconds");

        startTime = currentTimeMillis();
        List<NodeName> nodeNameList = nodeNameRepository.findAll();
        endTime = currentTimeMillis();
        System.out.println("NodeNameList was received in " + (endTime - startTime) + " milliseconds");

        startTime = currentTimeMillis();
        List<NestedSetsTree> setsTreeList = nestedSetsTreeRepository.findAll();
        endTime = currentTimeMillis();
        System.out.println("setsTreeList was received in " + (endTime - startTime) + " milliseconds");

        startTime = currentTimeMillis();
        List<MaterializedPath> materializedPathList = materializedPathRepository.findAll();
        endTime = currentTimeMillis();
        System.out.println("materializedPathList was received in " + (endTime - startTime) + " milliseconds");

        String dummy = "dummy";
    }
}
