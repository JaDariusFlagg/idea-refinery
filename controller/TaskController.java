package com.idearefinery.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idearefinery.assignment.entity.Task;
import com.idearefinery.assignment.service.TaskService;

@CrossOrigin
@RestController
@ResponseBody
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/createTask")
	public Task createTask(@RequestBody Task task) {
		return taskService.saveTask(task);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/updateTask/{id}")
	public Task updateTaskById(@RequestBody Task task, @PathVariable("id") int taskId) {
		return taskService.updateTask(task, taskId);
	}
	@GetMapping("/tasks")
	public List<Task> getAllTasks(){
		return taskService.getAllTasks();
	}
	
	@GetMapping("/taskId")
	public Task getTaskById(@PathVariable int taskId) {
		return taskService.findById(taskId);
	}
}

