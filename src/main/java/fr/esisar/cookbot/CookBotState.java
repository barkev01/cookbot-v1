package fr.esisar.cookbot;

public interface CookBotState {
	
	void switchOn(CookBot cookBot);
	
	void regularCook(CookBot cookBot);
	
	void switchOff(CookBot cookBot);
	
}
