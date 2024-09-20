package com.idearefinery.assignment.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idearefinery.assignment.entity.Task;

@Repository
public class TaskRepository {
	
	public final List<Task> taskList = new ArrayList<Task>();
	
	public List<Task> getAllTasks(){
		return taskList;
	}
	
	public Task findById(int id) {
		for(Task t: taskList) {
			if(t.getId() == id) {
				return taskList.get(id);
			}
		}
		return null;
	}
	
	public Task save(Task task) {
		Task t = new Task();
		t.setTitle(task.getTitle());
		t.setId(task.getId());
		t.setDescription(task.getDescription());
		t.setCompleted(task.getCompleted());
		t.setCreateDate(task.getCreateDate());
		t.setCompleteDate(task.getCompleteDate());
		taskList.add(t);
		return t;
	}
}
