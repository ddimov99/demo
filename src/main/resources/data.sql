INSERT INTO roles (name) VALUES ('USER');
INSERT INTO roles (name) VALUES ('ADMIN');
INSERT INTO roles (name) VALUES ('FLY');

INSERT INTO users (username, password) VALUES ('user', '$2a$10$YlNLWiwy62iuNsW9yEpmY.cbIGaJ8aXJjKTTZ7Q4yjzqwDnvOMKFu');
INSERT INTO users (username, password) VALUES ('admin', '$2a$10$bN7OWEvi6rTqJEYbZfDOg.FHmG.xPTDxJR1k9LzsR4O6Nt8zuIKwq');
INSERT INTO users (username, password) VALUES ('fly', '$2a$10$EyZdealK.84WSoN5c071huG2Uca9/FyJpm7p7eCJkpmbjSJhE1wgG');

INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (3, 3);
