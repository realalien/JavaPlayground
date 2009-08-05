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

	public Telegram(int sender, int receiver, int msg, double dispatchTime) {
		this.sender = sender;
		this.receiver = receiver;
		this.msg = msg;
		this.dispatchTime = dispatchTime;
	}

	// any additional information that may accompany the message
	// TODO: how to behavior like CPP with extra data?
	// void* ExtraInfo;

}
