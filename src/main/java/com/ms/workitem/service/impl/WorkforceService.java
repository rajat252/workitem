package com.ms.workitem.service.impl;

import java.util.HashMap;
import java.util.List;

import com.ms.workitem.entity.BaseItem;
import com.ms.workitem.entity.Bug;
import com.ms.workitem.entity.Feature;
import com.ms.workitem.entity.Task;
import com.ms.workitem.enums.WorkItem;
import com.ms.workitem.service.IBugService;
import com.ms.workitem.service.IFeatureService;
import com.ms.workitem.service.ITaskService;
import com.ms.workitem.service.IWorkforceService;

public class WorkforceService implements IWorkforceService{

	
	private IFeatureService featureService = new FeatureService();
	private IBugService bugService = new BugService();
	private ITaskService taskService = new TaskService();
	
	public void createWorkItem(BaseItem baseItem, WorkItem type) {
		if(type.equals(WorkItem.BUG)) {
			bugService.createBug((Bug)baseItem);
		}
		else if(type.equals(WorkItem.FEATURE)) {
			featureService.createFeature((Feature)baseItem);
		}
		else if(type.equals(WorkItem.TASK)) {
			taskService.createTask((Task)baseItem);
		}
	}
	
	
	
	public void deleteWorkItem(BaseItem baseItem, WorkItem type) {
		if(type.equals(WorkItem.BUG)) {
			bugService.deleteBug((Bug)baseItem);
		}
		else if(type.equals(WorkItem.FEATURE)) {
			featureService.deleteFeature((Feature)baseItem);
		}
		else if(type.equals(WorkItem.TASK)) {
			taskService.deleteTask((Task)baseItem);
		}
	}
	
	public void updateWorkItem(BaseItem baseItem, WorkItem type, String name) {
		if(type.equals(WorkItem.BUG)) {
			bugService.updateBug((Bug)baseItem, name);
		}
		else if(type.equals(WorkItem.FEATURE)) {
			featureService.updateFeature((Feature)baseItem, name);
		}
		else if(type.equals(WorkItem.TASK)) {
			taskService.updateTask((Task)baseItem, name);
		}
	}
	
	public BaseItem getWorkItem(WorkItem type, String name) {
		if(type.equals(WorkItem.BUG)) {
			return bugService.getBug(name);
		}
		else if(type.equals(WorkItem.FEATURE)) {
			return featureService.getFeature(name);
		}
		else if(type.equals(WorkItem.TASK)) {
			return taskService.getTask(name);
		}
		return null;
	}
	
	public List<BaseItem> searchWorkItem(WorkItem type, String name) {
		if(type.equals(WorkItem.BUG)) {
			return bugService.searchStr(name);
		}
		else if(type.equals(WorkItem.FEATURE)) {
			return featureService.searchStr(name);
		}
		else if(type.equals(WorkItem.TASK)) {
			return taskService.searchStr(name);
		}
		return null;
	}
}
