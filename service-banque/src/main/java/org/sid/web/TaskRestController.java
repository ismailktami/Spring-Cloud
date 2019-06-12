package org.sid.web;

import java.util.List;

import org.sid.dao.TaskRepository;
import org.sid.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TaskRestController {
	@Autowired
	private TaskRepository taskRepository;
	@GetMapping(value="/tasks")
	public List<Task> listTasks(){
		return taskRepository.findAll();
		
	}
	
	@PostMapping(value="/tasks/")
	public Task save(@RequestBody Task task) {
		return taskRepository.save(task);
	}
	
	
	

}
