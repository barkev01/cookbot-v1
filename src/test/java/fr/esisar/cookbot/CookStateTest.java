package fr.esisar.cookbot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CookStateTest {
	
	private CookBot cookBot;
	
	@BeforeEach
	void initalizeCookBot() {
		this.cookBot = new CookBot();
		cookBot.regularCook();
		assertInstanceOf(CookState.class, cookBot.getState());
	}
	
	@Test
	void switchOn() {
		cookBot.switchOn();
		assertInstanceOf(OnState.class, cookBot.getState());
	}
	
	@Test
	void regularCook() {
		cookBot.regularCook();
		assertInstanceOf(CookState.class, cookBot.getState());
	}
	
	
	@Test
	void switchOff() {
		cookBot.switchOff();
		assertInstanceOf(CookState.class, cookBot.getState());
	}
}
