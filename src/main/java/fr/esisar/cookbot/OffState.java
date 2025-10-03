package fr.esisar.cookbot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OffState implements CookBotState {

	private static final Logger LOGGER = LogManager.getLogger(OffState.class);

	
	@Override
	public void switchOn(CookBot cookBot) {
		cookBot.setState(new OnState());
		LOGGER.info("Turning on");
	}

	@Override
	public void regularCook(CookBot cookBot) {
		LOGGER.warn("Can't cook while turned off");
	}

	@Override
	public void switchOff(CookBot cookBot) {
		LOGGER.warn("Alread off");
	}

}
