package com.example.treetest.persistance.entity;


import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "nested_sets", indexes = {
        @Index(name = "IDX_LEFT_VALUE", columnList = "left_value"),
        @Index(name = "IDX_RIGHT_VALUE", columnList = "right_value")
})
@DynamicUpdate
public class NestedSetsTree {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    @NotNull
    private String name;
    @NotNull
    @Column(name = "left_value")
    private long leftValue;
    @NotNull
    @Column(name = "right_value")
    private long rightValue;
}
