package com.example.treetest;

import com.example.treetest.config.SpringContext;
import com.example.treetest.domain.service.AdjacencyNodeProcessor;
import com.example.treetest.domain.service.TreeService;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories("com.example.treetest.persistance.repository")
public class TreetestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreetestApplication.class, args);
        getTreeService().receiveAllData();
        AdjacencyNodeProcessor anProcessor = new AdjacencyNodeProcessor(new Faker(), getTreeService().getAdjacencyNodeRepository());
        anProcessor.fillFakeData(2, 3);
    }

    private static TreeService getTreeService() {
        return SpringContext.getBean(TreeService.class);
    }
}
