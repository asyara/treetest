create table if not exists adjacency_tree (
  id BIGSERIAL primary key,
  name text not null,
  parent_id bigint,
  CONSTRAINT FK_PARENT_ID FOREIGN KEY (parent_id) REFERENCES adjacency_tree (id)
);
