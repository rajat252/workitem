package com.ms.workitem.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ms.workitem.entity.BaseItem;
import com.ms.workitem.entity.Bug;
import com.ms.workitem.service.IBugService;

public class BugService implements IBugService{

	
	private HashMap<String,Bug> bugMap = new HashMap<String, Bug>();
	
	
	
	public void createBug(Bug bug) {
		bugMap.put(bug.getName(),bug);
	}
	
	public void deleteBug(Bug bug) {
		bugMap.remove(bug.getName());
	}
	
	public void updateBug(Bug bug, String name) {
		
		bugMap.put(name,bug);
	}
	
	public Bug getBug(String name) {
		return bugMap.get(name);
	}
	
	public List<BaseItem> searchStr(String name){
		List<BaseItem> list = new ArrayList<BaseItem>();
		for(String bugName :bugMap.keySet()) {
			if(bugName.contains(name)) {
				list.add(bugMap.get(bugName));
			}
		}
		return list;
	}
}
