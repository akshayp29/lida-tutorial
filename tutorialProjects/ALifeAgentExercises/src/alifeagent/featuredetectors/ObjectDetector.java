/*******************************************************************************
 * Copyright (c) 2009, 2011 The University of Memphis.  All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the LIDA Software Framework Non-Commercial License v1.0 
 * which accompanies this distribution, and is available at
 * http://ccrg.cs.memphis.edu/assets/papers/2010/LIDA-framework-non-commercial-v1.0.pdf
 *******************************************************************************/
package alifeagent.featuredetectors;

import java.util.HashMap;
import java.util.Map;

import edu.memphis.ccrg.lida.framework.shared.Linkable;
import edu.memphis.ccrg.lida.pam.PerceptualAssociativeMemory;
import edu.memphis.ccrg.lida.pam.tasks.BasicDetectionAlgorithm;
import edu.memphis.ccrg.lida.sensorymemory.SensoryMemory;

public class ObjectDetector extends BasicDetectionAlgorithm{
	
	private Map<String, Object> detectorParams = new HashMap<String, Object>();
	
	/**
	 * Default constructor. Associated {@link Linkable},
	 * {@link PerceptualAssociativeMemory} and {@link SensoryMemory} must be set
	 * using setters.
	 */
	public ObjectDetector() {
	}

	@Override
	public void init() {
		super.init();
		Integer position = (Integer)getParam("position", 0);
		detectorParams.put("position", position);
		String obj = (String)getParam("object", null);
		detectorParams.put("object", obj);
	}

	
	@Override
	public double detect() {
		if((Boolean) sensoryMemory.getSensoryContent("", detectorParams)){
			return 1.0;
		}
		return 0.0;
	}
}
