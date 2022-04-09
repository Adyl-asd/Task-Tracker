USE `review-service`;

CREATE TABLE `user`
(
    `id`       INT AUTO_INCREMENT NOT NULL,
    `email`    VARCHAR(128)       NOT NULL,
    `password` VARCHAR(128)       NOT NULL,
    `username` VARCHAR(128)       NOT NULL DEFAULT 'No Name',
    `active`   BOOLEAN            NOT NULL DEFAULT TRUE,
    `role`     VARCHAR(24)        NOT NULL DEFAULT 'USER',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `email_unique` (`email` ASC)
);

INSERT INTO `user` (email, password, username, role) VALUES
('admin@admin.com', '$2a$10$kJYT8r.dSRmlaj8AB8WWLOEdO2QRYjfsQ84gadPFiUp.zlajJFiEy', 'admin', 'ADMIN');