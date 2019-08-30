package com.utility;

import java.util.ArrayList;
import java.util.List;

import com.bean.Call;

public class CallHistory {
	private List<Call> callData = new ArrayList<Call>();

	public List<Call> getCallData() {
		return callData;
	}

	public void setCallList(List<Call> callList) {
		this.callData = callData;
	}

	// This method should add the callObject into callList
	public void addCall(Call callObject) {
		this.callData.add(callObject);
	}

	// this method returns the total duration (float) spent to a particular
	// callednumber
	public float findTotalDuration(long calledNumber) {
		float duration = 0f;
		for (Call call : callData) {
			if (call.getCalledNumber() == calledNumber)
				duration += call.getDuration();
		}
		return duration;
	}

}
