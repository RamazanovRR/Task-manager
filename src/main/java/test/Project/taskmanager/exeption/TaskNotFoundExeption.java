package test.Project.taskmanager.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TaskNotFoundExeption extends RuntimeException {
    public TaskNotFoundExeption(String message) {
        super(message);
    }
}
