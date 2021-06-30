package com.ms.workitem.service;

import java.util.List;

import com.ms.workitem.entity.BaseItem;
import com.ms.workitem.entity.Feature;

public interface IFeatureService {

	public void createFeature(Feature bug) ;
	public void deleteFeature(Feature bug);
	public void updateFeature(Feature bug, String name);
	public BaseItem getFeature(String name);
	public List<BaseItem> searchStr(String name);
}
