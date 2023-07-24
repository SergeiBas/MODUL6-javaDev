DROP TABLE project cascade;
DROP TABLE project_worker cascade;

CREATE TABLE project
(
    project_id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    client_id INT,
    start_date DATE,
    finish_date DATE,
    CONSTRAINT client_id_fk FOREIGN KEY (client_id) REFERENCES client(client_id) ON DELETE CASCADE
);

CREATE TABLE project_worker
(
    project_id INT NOT NULL,
    worker_id INT NOT NULL,
    PRIMARY KEY (project_id, worker_id),
    FOREIGN KEY (project_id) REFERENCES project(project_id) ON DELETE CASCADE,
    FOREIGN KEY (worker_id) REFERENCES worker(worker_id) ON DELETE CASCADE
)