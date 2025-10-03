package fr.esisar.cookbot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CookState implements CookBotState {
	
	private static final Logger LOGGER = LogManager.getLogger(CookState.class);
	
	@Override
	public void switchOn(CookBot cookBot) {
		cookBot.setState(new OnState());
		LOGGER.info("Turning on");
	}

	@Override
	public void regularCook(CookBot cookBot) {
		LOGGER.warn("Already cooking");
	}

	@Override
	public void switchOff(CookBot cookBot) {
		LOGGER.warn("Can't turn off while cooking");
	}

}
