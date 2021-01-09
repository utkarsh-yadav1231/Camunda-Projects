package com.utyadav.company.NSNLeaveRequest;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.engine.ProcessEngine;

/**
 * Process Application exposing this application's resources to the process engine.
 */
@ProcessApplication
public class CamundaBpmProcessApplication extends ServletProcessApplication {
	
	public static final String PROCESS_DEFINITION_KEY = "NSNEmployeePlaybook"; // BPMN Process ID

	 @PostDeploy
	  public void onDeploymentFinished(ProcessEngine processEngine) {
		 /*
	    start an initial process instance
	    Map<String, Object> variables = new HashMap<String, Object>();
	    variables.put("name", "John");	    
	    processEngine.getRuntimeService().startProcessInstanceByKey(PROCESS_DEFINITION_KEY, variables);
         */	  
	  }
}
