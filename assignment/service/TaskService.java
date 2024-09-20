/**
 * 
 */
package com.idearefinery.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idearefinery.assignment.entity.Task;
import com.idearefinery.assignment.repository.TaskRepository;

/**
 * @author JD
 *
 */

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}
	
	public Task findById(int id) {
		return taskRepository.findById(id);
	}
	
	public List<Task> getAllTasks(){
		return taskRepository.getAllTasks();
	}

	public Task updateTask(Task task, int taskId) {
		return taskRepository.save(task);
		
	}
}
