package state.pattern.auto.shooter;

public class Telegram {


	// the entity that sent this telegram
	int sender;

	// the entity that is to receive this telegram
	int receiver;

	// the message itself. These are all enumerated in the file
	// "MessageTypes.h"
	int msg;

	// messages can be dispatched immediately or delayed for a specified amount
	// of time. If a delay is necessary, this field is stamped with the time
	// the message should be dispatched.
	double dispatchTime;

	Object extraInfo ;
	
	public Telegram(int sender, int receiver, int msg, double dispatchTime, Object extraInfo) {
		this.sender = sender;
		this.receiver = receiver;
		this.msg = msg;
		this.dispatchTime = dispatchTime;
		this.extraInfo = extraInfo;
	}

	// any additional information that may accompany the message
	// TODO: how to behavior like CPP with extra data?
	// void* ExtraInfo;

	public int getSender() {
		return sender;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public int getReceiver() {
		return receiver;
	}

	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}

	public int getMsg() {
		return msg;
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}

	public double getDispatchTime() {
		return dispatchTime;
	}

	public void setDispatchTime(double dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	public Object getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(Object extraInfo) {
		this.extraInfo = extraInfo;
	}
}
