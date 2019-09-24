package test.Project.taskmanager.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.Project.taskmanager.model.Task;
import test.Project.taskmanager.repository.TaskRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
public class taskController {

    private int count = 4;

    private TaskRepository taskRepository;

    @Autowired
    public taskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public List<Task> list(){
        return taskRepository.findAll();
    }

    @GetMapping("{id}")
    public Task getOne(@PathVariable("id") Task task){
        return task;
    }

    @PostMapping
    public Task create(@RequestBody Task task){
        return taskRepository.save(task);
    }

    @PutMapping("{id}")
    public Task updateTask(@PathVariable("id") Task taskFromDB, @RequestBody Task task){
        BeanUtils.copyProperties(task, taskFromDB, "id");
        return taskRepository.save(taskFromDB);
    }

    @DeleteMapping("{id}")
    public void deleteTask(@PathVariable("id") Task task){
        taskRepository.delete(task);
    }
}
