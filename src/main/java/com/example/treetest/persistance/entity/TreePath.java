package com.example.treetest.persistance.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "tree_path")
@DynamicUpdate
@IdClass(TreePathId.class)
public class TreePath {

    @Id
    @ManyToOne(targetEntity = NodeName.class)
    @JoinColumn(name = "ancestor", nullable = false, foreignKey = @ForeignKey(name = "FK_ANCESTOR"))
    private NodeName ancestor;

    @Id
    @ManyToOne(targetEntity = NodeName.class)
    @JoinColumn(name = "descendant", nullable = false, foreignKey = @ForeignKey(name = "FK_DESCENDANT"))
    private NodeName descendant;
}
