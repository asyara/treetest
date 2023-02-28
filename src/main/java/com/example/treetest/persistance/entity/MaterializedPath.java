package com.example.treetest.persistance.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "materialized_path", indexes = @Index(name = "IDX_PATH", columnList = "path"))
public class MaterializedPath {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String path;
}