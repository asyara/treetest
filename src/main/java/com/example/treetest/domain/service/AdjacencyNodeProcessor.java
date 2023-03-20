package com.example.treetest.domain.service;

import com.example.treetest.persistance.entity.AdjacencyNode;
import com.example.treetest.persistance.repository.AdjacencyNodeRepository;
import com.example.treetest.utils.FillDataProcessor;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.of;

@Component
@RequiredArgsConstructor
public class AdjacencyNodeProcessor implements FillDataProcessor {

    private final Faker faker;
    @Autowired
    private final AdjacencyNodeRepository adjacencyNodeRepository;

    @Override
    public void fillFakeData(int deep, int quantityOnNode) {
        AdjacencyNode parentNode = createParentNode();
        List<AdjacencyNode> nodeList = recursiveFillTree(parentNode, deep, quantityOnNode);
        adjacencyNodeRepository.saveAll(nodeList);
    }

    @Override
    public void clear() {
    }

    private AdjacencyNode createParentNode() {
        AdjacencyNode node = new AdjacencyNode();
        node.setId(1);
        node.setName(faker.commerce().productName());
        node.setParent(null);
        return node;
    }

    private List<AdjacencyNode> recursiveFillTree(AdjacencyNode parentNode, int deep, int quantityOnNode) {
        if (deep > 0 && quantityOnNode > 0) {
            return range(0, quantityOnNode)
                    .mapToObj(i -> {
                        AdjacencyNode childNode = new AdjacencyNode();
                        childNode.setId(parentNode.getId() * 10 + i + 1);
                        childNode.setName(faker.commerce().productName());
                        childNode.setParent(parentNode);
                        childNode.setChildren(recursiveFillTree(childNode, deep - 1, quantityOnNode));
                        return childNode;
                    })
                    .flatMap(childNode -> concat(of(childNode), childNode.getChildren().stream()))
                    .collect(toList());
        }
        return new ArrayList<>();
    }
}
