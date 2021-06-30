package com.ms.workitem.entity;

import java.util.List;

public class Feature extends BaseItem{

	private List<Task> tasks;
	private List<Bug> bugs;
	private Feature dependency;

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Bug> getBugs() {
		return bugs;
	}

	public void setBugs(List<Bug> bugs) {
		this.bugs = bugs;
	}

	public Feature getDependency() {
		return dependency;
	}

	public void setDependency(Feature dependency) {
		this.dependency = dependency;
	}
	
	
}
