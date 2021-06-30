package com.ms.workitem.service;

import java.util.List;

import com.ms.workitem.entity.BaseItem;
import com.ms.workitem.entity.Bug;

public interface IBugService {

	public void createBug(Bug bug) ;
	public void deleteBug(Bug bug);
	public void updateBug(Bug bug, String name);
	public BaseItem getBug(String name);
	public List<BaseItem> searchStr(String name);
}
