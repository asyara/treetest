package com.example.treetest.persistance.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static org.hibernate.annotations.OnDeleteAction.CASCADE;

@Getter
@Setter
@Entity
@Table(name = "adjacency_tree")
public class AdjacencyNode implements Serializable {

    @Id
    private long id;

    @NotNull
    private String name;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "parent_id", foreignKey = @ForeignKey(name = "FK_PARENT_ID"))
    private AdjacencyNode parent;

    @OneToMany(fetch = LAZY, cascade = ALL)
    @JoinColumn(name = "parent_id")
    @OnDelete(action = CASCADE)
    private List<AdjacencyNode> children = new ArrayList<>();
}
