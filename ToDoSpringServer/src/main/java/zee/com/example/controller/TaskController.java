package zee.com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zee.com.example.model.TaskRepository;
import zee.com.example.model.Tasks;

import java.util.List;

/**
 * Created by zulup on 1/19/2018.
 */
@RestController
@RequestMapping(value = "/todo")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "tasks")
    public List<Tasks> getTasks() {
        return taskRepository.findAll();
    }

    @RequestMapping(value = "newTask")
    public List<Tasks> newTask(@RequestBody Tasks task) {
        taskRepository.save(task);
        return taskRepository.findAll();
    }
    @RequestMapping(value = "getTask/{uid}")
    public Tasks getTask(@PathVariable(name = "uid") int uid) {
       Tasks task= taskRepository.findByUid(uid);
        return task;
    }
}
