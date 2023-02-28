package com.example.treetest.persistance.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table(name = "node_name")
@DynamicUpdate
public class NodeName {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    @NotNull
    private String name;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "descendant")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<TreePath> parents = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ancestor")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<TreePath> children = new ArrayList<>();
}
