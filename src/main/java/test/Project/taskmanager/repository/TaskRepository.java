package test.Project.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.Project.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
