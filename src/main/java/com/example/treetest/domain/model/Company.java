package com.example.treetest.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Company extends Element {

    private List<Department> departments;
}
