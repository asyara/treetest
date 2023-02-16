package com.example.treetest.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Client extends Element {

    private List<Group> groups;
}
