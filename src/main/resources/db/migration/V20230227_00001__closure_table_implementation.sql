CREATE TABLE adjacency_tree (
  id BIGSERIAL NOT NULL,
  name VARCHAR(255),
  parent_id int8,
  PRIMARY KEY (id)
);
CREATE TABLE node_name (
  id BIGSERIAL NOT NULL,
  name VARCHAR(255),
  PRIMARY KEY (id)
);
CREATE TABLE tree_path (
  ancestor int8 NOT NULL,
  descendant int8 NOT NULL,
  PRIMARY KEY (ancestor, descendant)
);
ALTER TABLE
  adjacency_tree
ADD
  CONSTRAINT FK_PARENT_ID FOREIGN KEY (parent_id) REFERENCES adjacency_tree ON DELETE CASCADE;
ALTER TABLE
  tree_path
ADD
  CONSTRAINT FK_ANCESTOR FOREIGN KEY (ancestor) REFERENCES node_name ON DELETE CASCADE;
ALTER TABLE
  tree_path
ADD
  CONSTRAINT FK_DESCENDANT FOREIGN KEY (descendant) REFERENCES node_name ON DELETE CASCADE;