package com.bean;

public class Call {
	private int callId;
	private long calledNumber;
	private float duration;

	public int getCallId() {
		return callId;
	}

	public long getCalledNumber() {
		return calledNumber;
	}

	public float getDuration() {
		return duration;
	}

	public void setCallId(int callId) {
		this.callId = callId;
	}

	public void setCalledNumber(long calledNumber) {
		this.calledNumber = calledNumber;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public void parseData(String details) {
		int id = Integer.parseInt(details.split(":")[0]);
		Long calledNumber = Long.parseLong(details.split(":")[1]);
		float duration = Float.parseFloat(details.split(":")[2]);
		this.setCallId(id);
		this.setCalledNumber(calledNumber);
		this.setDuration(duration);

	}

}
