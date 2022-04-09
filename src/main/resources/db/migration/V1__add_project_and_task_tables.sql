use `task_tracker`;

CREATE TABLE `project`
(
    `id`         INT AUTO_INCREMENT NOT NULL,
    `name`       VARCHAR(128)       NOT NULL,
    `start_date` DATE               NOT NULL,
    `end_date`   DATE               NOT NULL,
    `status`     VARCHAR(64)        NOT NULL,
    `priority`   INT                NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `task`
(
    `id`          INT AUTO_INCREMENT NOT NULL,
    `name`        VARCHAR(128)       NOT NULL,
    `description` VARCHAR(512),
    `priority`    INT                NOT NULL,
    `project_id`  INT                NOT NULL REFERENCES `project` (`id`),
    PRIMARY KEY (`id`)
);