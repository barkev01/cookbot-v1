package fr.esisar.cookbot;

public class CookBot {
		
	private CookBotState state;
	
	public CookBot() {
		super();
		state = new OnState();
	}
	
	public void switchOn() {
		this.state.switchOn(this);
	}
	
	public void regularCook() {
		this.state.regularCook(this);
	}
	
	public void switchOff() {
		this.state.switchOff(this);
	}
	
	public CookBotState getState() {
		return this.state;
	}

	public void setState(CookBotState state) {
		this.state = state;
	}
	
}
