USE `task_tracker`;

INSERT INTO `task` (name, status, description, priority, project_id)
VALUES ('Task 1', 'TO_DO', 'Some description for some task', 1, 1),
       ('Task 2', 'TO_DO', 'Some description for some task', 1, 1),
       ('Task 3', 'TO_DO', 'Some description for some task', 1, 1),
       ('Task 1', 'TO_DO', 'Some description for some task', 1, 2),
       ('Task 2', 'TO_DO', 'Some description for some task', 1, 2),
       ('Task 3', 'TO_DO', 'Some description for some task', 1, 2),
       ('Task 1', 'TO_DO', 'Some description for some task', 1, 3),
       ('Task 2', 'TO_DO', 'Some description for some task', 1, 3),
       ('Task 3', 'TO_DO', 'Some description for some task', 1, 3);