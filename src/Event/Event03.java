package Event;

import Main.GameManager;

public class Event03 {
	public GameManager gm;
	
	
	String position;
	public Event03(GameManager gm) {
		this.gm=gm;
		
	}
	//europe
	
	public void voirEurope() {
		gm.ui.messageText.setText("C'est L'EUROPE");
		
	}
	public void infoEurope() {
		gm.ui.messageText.setText("EUROPE : ....");
		
	}
	public void sauverEurope() {
		
		if(gm.player.playerLife>=1) {
			gm.sChanger.showSceneEurope();
		}
		
	}
	//afrique
	
	public void voirAfrica() {
		gm.ui.messageText.setText("C'est L'Africa");
		
	}
	public void infoAfrica() {
		gm.ui.messageText.setText("Africa : ....");
		
	}
	public void sauverAfrica() {
		if(gm.player.playerLife>=1) {
		gm.sChanger.showSceneAfrica();
	}
		
	}
	//amerique
	
	public void voirAmerica() {
		gm.ui.messageText.setText("C'est L'America");
		
	}
	public void infoAmerica() {
		gm.ui.messageText.setText("America : ....");
		
	}
	public void sauverAmerica() {
	if(gm.player.playerLife>=1) {
		gm.sChanger.showSceneAmerica();
	}
		
	}
	
	//asie
	
	
	public void voirAsia() {
		gm.ui.messageText.setText("C'est L'Asia");
		
	}
	public void infoAsia() {
		gm.ui.messageText.setText("Asia : ....");
		
	}
	public void sauverAsia() {
		if(gm.player.playerLife>=1) {
		gm.sChanger.showSceneAsia();
	}
		
	}
	
	//australia
	
	
	public void voirAustralia() {
		gm.ui.messageText.setText("C'est L'Australia");
		
	}
	public void infoAustralia() {
		gm.ui.messageText.setText("Australia : ....");
		
	}
	public void sauverAustralia() {
		if(gm.player.playerLife>=1) {
		gm.sChanger.showSceneAustralia();
		}
		
		
		
	}
	
	//antarctique
	
	public void voirAntarctique() {
		gm.ui.messageText.setText("C'est L'Antarctique");
		
	}
	public void infoAntarctique() {
		gm.ui.messageText.setText("Antarctique : ....");
		
	}
	public void sauverAntarctique() {
		if(gm.player.playerLife>=1) {
		gm.sChanger.showSceneAntarctique();
	}
		
	}
	
	
	
	
	
	
	
	
	

}
