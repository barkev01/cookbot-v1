package fr.esisar.cookbot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OnState implements CookBotState {

	private static final Logger LOGGER = LogManager.getLogger(OnState.class);

	@Override
	public void switchOn(CookBot cookBot) {
		LOGGER.warn("Already on");
	}

	@Override
	public void regularCook(CookBot cookBot) {
		cookBot.setState(new CookState());
		LOGGER.warn("Cooking...");
	}

	@Override
	public void switchOff(CookBot cookBot) {
		cookBot.setState(new OffState());
		LOGGER.warn("Bye Bye...");
	}

}
