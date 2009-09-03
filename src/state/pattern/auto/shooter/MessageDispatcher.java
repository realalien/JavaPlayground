package state.pattern.auto.shooter;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MessageDispatcher {

	// a queue for future dispatching.
	// TODO:
	private static Set<Telegram> priorityQ;

	private static MessageDispatcher instance;

	public static MessageDispatcher getInstance() {
		if (instance == null) {
			instance = new MessageDispatcher();
		}
		return instance;
	}

	private MessageDispatcher() {
		priorityQ = new HashSet<Telegram>();
	}

	public static void DispatchMessage(double delay, int sender, int receiver,
			int msg, Object ExtraInfo) {
		// get a pointer to the receiver of the message
		BaseGameEntity pReceiver = EntityManager.GetEntityFromID(receiver);
		// create the telegram
		Telegram telegram = new Telegram(0, sender, receiver, msg, ExtraInfo);

		// if there is no delay, route the telegram immediately
		if (delay <= 0.0) {
			// send the telegram to the recipient
			Discharge(pReceiver, telegram);
		}//else calculate the time when the telegram should be dispatched
		  else
		  {
		    double CurrentTime = System.currentTimeMillis(); //Clock->GetCurrentTime();

		    telegram.setDispatchTime( CurrentTime + delay );

		    //and put it in the queue
		    priorityQ.add(telegram);
		  }
	}

	// send out any delayed messages. This method is called each time through
	// the main game loop.
	public static void DispatchDelayedMessages() {
		//first get current time
		  double CurrentTime = System.currentTimeMillis();

		  //now peek at the queue to see if any telegrams need dispatching.
		  //remove all telegrams from the front of the queue that have gone
		  //past their sell-by date
//		  while( (priorityQ.->DispatchTime < CurrentTime) &&
//		         (priorityQ.begin()->DispatchTime > 0) )
//		  {
//		    //read the telegram from the front of the queue
//		    Telegram telegram = *priorityQ.begin();
//
//		    //find the recipient
//		    Entity* pReceiver = EntityMgr->GetEntityFromID(telegram.Receiver);
//
//		    //send the telegram to the recipient
//		    Discharge(pReceiver, telegram);
//
//		    //and remove it from the queue
//		    priorityQ.erase(priorityQ.begin());
//		  }

	}
	
	// this method is utilized by DispatchMessage or DispatchDelayedMessages.
	// This method calls the message handling member function of the receiving
	// entity, pReceiver, with the newly created telegram
	private static void Discharge(BaseGameEntity pReceiver, final Telegram msg) {
		// TODO: Q: what's the difference between this class Entity? subclass?
		//pReceiver.handle(msg);  //idea: turn handle() into interface?
		
		
	}

	

}
