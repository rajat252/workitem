package com.ms.workitem.service;

import java.util.List;

import com.ms.workitem.entity.BaseItem;
import com.ms.workitem.enums.WorkItem;

public interface IWorkforceService {

	public void createWorkItem(BaseItem baseItem, WorkItem type);
	public void deleteWorkItem(BaseItem baseItem, WorkItem type);
	public void updateWorkItem(BaseItem baseItem, WorkItem type, String name);
	public BaseItem getWorkItem(WorkItem type, String name);
	public List<BaseItem> searchWorkItem(WorkItem type, String name);
}

