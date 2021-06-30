package com.ms.workitem.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ms.workitem.entity.BaseItem;
import com.ms.workitem.entity.Feature;
import com.ms.workitem.service.IFeatureService;

public class FeatureService implements IFeatureService{

	
	private HashMap<String,Feature> featureMap = new HashMap<String, Feature>();
	
	
	
	public void createFeature(Feature feature) {
		featureMap.put(feature.getName(),feature);
	}
	
	public void deleteFeature(Feature feature) {
		featureMap.remove(feature.getName());
	}
	
	public void updateFeature(Feature feature, String name) {
		
		featureMap.put(name,feature);
	}
	
	public Feature getFeature(String name) {
		return featureMap.get(name);
	}
	
	public List<BaseItem> searchStr(String name){
		List<BaseItem> list = new ArrayList<BaseItem>();
		for(String featureName :featureMap.keySet()) {
			if(featureName.contains(name)) {
				list.add(featureMap.get(featureName));
			}
		}
		return list;
	}
}
