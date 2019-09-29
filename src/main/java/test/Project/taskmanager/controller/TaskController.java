package test.Project.taskmanager.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.Project.taskmanager.model.Task;
import test.Project.taskmanager.repository.TaskRepository;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/task")
public class TaskController {

    private TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public List<Task> list(){
        List<Task> arrList = taskRepository.findAll();

        //Sorted collection of task from DB by id field
        Collections.sort(arrList);
        return arrList;
    }

    @GetMapping("{id}")
    public Task getOne(@PathVariable("id") Task task){
        return task;
    }

    @PostMapping
    public Task create(@RequestBody Task task){
        // The method recorded the local date and time in the task object at the moment of create
        task.setCreateDate(LocalDateTime.now());
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
