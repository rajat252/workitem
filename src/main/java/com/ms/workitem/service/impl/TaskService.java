package com.ms.workitem.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ms.workitem.entity.BaseItem;
import com.ms.workitem.entity.Task;
import com.ms.workitem.service.ITaskService;

public class TaskService implements ITaskService{

	private HashMap<String,Task> taskMap = new HashMap<String, Task>();
	
	public void createTask(Task task) {
		taskMap.put(task.getName(),task);
	}
	
	public void deleteTask(Task task) {
		taskMap.remove(task.getName());
	}
	
	public void updateTask(Task task, String name) {
		
		taskMap.put(name,task);
	}
	
	public Task getTask(String name) {
		return taskMap.get(name);
	}
	
	public List<BaseItem> searchStr(String name){
		List<BaseItem> list = new ArrayList<BaseItem>();
		for(String taskName :taskMap.keySet()) {
			if(taskName.contains(name)) {
				list.add(taskMap.get(taskName));
			}
		}
		return list;
	}
}
