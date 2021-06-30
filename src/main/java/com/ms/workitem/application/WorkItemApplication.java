package com.ms.workitem.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ms.workitem.entity.BaseItem;
import com.ms.workitem.entity.Bug;
import com.ms.workitem.entity.Feature;
import com.ms.workitem.entity.Task;
import com.ms.workitem.enums.WorkItem;
import com.ms.workitem.service.IWorkforceService;
import com.ms.workitem.service.impl.WorkforceService;

public class WorkItemApplication {

	public static void main(String args[]) {
		IWorkforceService workforService = new WorkforceService();
		Task t1 = populateTask("t1", "a1");
		Task t2 = populateTask("t2", "a1");
		workforService.createWorkItem(t1, WorkItem.TASK);
		workforService.createWorkItem(t2, WorkItem.TASK);
		
		Task t3 = (Task)workforService.getWorkItem(WorkItem.TASK, "t1");
		if(t1.getName().equals(t3.getName())) {
			System.out.println("task equalss");
		}
		workforService.deleteWorkItem( t1,WorkItem.TASK);
		Task t4 = (Task)workforService.getWorkItem(WorkItem.TASK, "t1");
		if(t4==null) {
			System.out.println("deleted");
		}
		List<Task> tasks = new ArrayList<Task>();
		tasks.add(t1);
		tasks.add(t2);
		
		Bug b1 = populateBug(tasks,"t1", "a1");
		workforService.createWorkItem(b1, WorkItem.BUG);
		Bug b3 = (Bug)workforService.getWorkItem(WorkItem.BUG, "t1");
		if(b1.getName().equals(b3.getName())) {
			System.out.println("bug equalss");
		}
		
		
		List<Bug> bugs = new ArrayList<Bug>	();
		bugs.add(b1);
		
		Feature f1 = populateFeature(tasks, bugs, null, "f1", "A2");
		workforService.createWorkItem(f1, WorkItem.FEATURE);
		Feature f2 = populateFeature(tasks, bugs, f1, "f2", "A2");
		
		Feature f3 = (Feature)workforService.getWorkItem(WorkItem.FEATURE, "f1");
		if(f1.getName().equals(f3.getName())) {
			System.out.println("feature equalss");
		}
	}
	
	
	public static  Feature populateFeature(List<Task> tasks, List<Bug> bugs, Feature dependentFeature, String name, String assignee) {
		Feature feature = new Feature();
		feature.setBugs(bugs);
		feature.setTasks(tasks);
		feature.setDependency(dependentFeature);
		feature = (Feature)populateBaseItem(feature, assignee, name);
		return feature;
	}
	public static Task populateTask( String name, String assignee) {
		Task task = new Task();
		task = (Task)populateBaseItem(task, assignee, name);
		return task;
	}
	public static  Bug populateBug(List<Task> tasks, String name, String assignee) {
		Bug bug = new Bug();
		bug.setTasks(tasks);
		bug = (Bug)populateBaseItem(bug, assignee, name);
		return bug;
	}
	
	public static BaseItem populateBaseItem(BaseItem baseItem, String assignee, String name) {
		baseItem.setAssignee(assignee);
		baseItem.setName(name);
		baseItem.setCreatedAt(new Date());
		baseItem.setUpdatedAt(new Date());
		return baseItem;
	}
}
