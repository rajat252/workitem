package com.ms.workitem.entity;

import java.util.List;

public class Bug extends BaseItem{

	private List<Task> tasks;

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
}
