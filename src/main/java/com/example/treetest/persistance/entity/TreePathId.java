package com.example.treetest.persistance.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
public class TreePathId implements Serializable {

    private long ancestor;
    private long descendant;
}
