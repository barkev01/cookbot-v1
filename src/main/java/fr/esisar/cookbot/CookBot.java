package fr.esisar.cookbot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CookBot {
	
	private static final Logger LOGGER = LogManager.getLogger(CookBot.class);

	
	static final int ON = 0;
	static final int OFF = 1;
	static final int COOK = 2;
	static final int SLOW_COOK = 3;
	
	private int state;
	
	public CookBot() {
		super();
		state = ON;
	}
	
	public void switchOn() {
		if(state == ON) {
			LOGGER.warn("Cookbot is already switched on");
		}else if (state == COOK) {
			state = ON;
			LOGGER.info("Cookbot is switched on");
		}else if (state == SLOW_COOK) {
			state = ON;
			LOGGER.info("Cookbot is switched on");
		}else if (state == OFF) {
			state = ON; 
			LOGGER.info("Cookbot is switched on");
		}
	}

	public void regularCook() {
		if(state == ON) {
			state = COOK;
			LOGGER.info("Cookbot is cooking...");
		}else if (state == COOK) {
			LOGGER.warn("Cookbot is already cooking...");
		}else if (state == SLOW_COOK) {
			state = COOK;
			LOGGER.info("Cookbot is cooking...");
		}else if (state == OFF) {
			LOGGER.warn("Cookbot cannot cook when it is turned off");
		}
	}
	
	public void switchOff() {
		if(state == ON) {
			state = OFF;
			LOGGER.info("Cookbot is switched off");
		}else if (state == COOK) {
			LOGGER.warn("Cookbot cannot be switched off while cooking");
		}else if (state == SLOW_COOK) {
			LOGGER.warn("Cookbot cannot be switched off while slowly cooking");
		}else if (state == OFF) {
			LOGGER.warn("Cookbot is already switched off");
		}
	}
	
	public void slowCook() {
		if(state == ON) {
			state = SLOW_COOK;
			LOGGER.info("Cookbot is cooking at a lower temperature...");
		}else if (state == COOK) {
			state = SLOW_COOK;
			LOGGER.info("Cookbot is cooking at a lower temperature...");
		}else if (state == SLOW_COOK) {
			LOGGER.info("Cookbot is already cooking at a lower temperature");
		}else if (state == OFF) {
			LOGGER.info("Cookbot is already switched off");
		}
	}
	
	public int getState() {
		return this.state;
	}
	

}
