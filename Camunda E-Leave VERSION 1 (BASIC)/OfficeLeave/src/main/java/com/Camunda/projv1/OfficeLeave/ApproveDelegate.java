package com.Camunda.projv1.OfficeLeave;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.util.Random;

public class ApproveDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Random rando = new Random();  
		execution.setVariable("name", "John Wick");
		execution.setVariable("approval_result_v2", rando.nextBoolean());

	}

}
