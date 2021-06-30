package com.ms.workitem.service;

import java.util.List;

import com.ms.workitem.entity.BaseItem;
import com.ms.workitem.entity.Task;

public interface ITaskService {

	public void createTask(Task task) ;
	public void deleteTask(Task task);
	public void updateTask(Task task, String name);
	public BaseItem getTask(String name);
	public List<BaseItem> searchStr(String name);
}
