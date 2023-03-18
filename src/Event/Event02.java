package Event;

import Main.GameManager;

public class Event02 {
	
	public GameManager gm;
	
	public Event02(GameManager gm) {
		this.gm = gm;
	}
	
	
	public void voirMap() {
		gm.ui.messageText.setText("C'est la map de jeu");
		
	}
	public void expliqueMap() {
		gm.ui.messageText.setText("Le jeu consiste à répondre à 6 énigmes \n Fait attention \n SAUVER LE MONDE ");
		
		
	}

	public void commencerMap() {
		if(gm.player.plante==0) {
			
			gm.ui.messageText.setText("On peut pas sauver le monde sans avoir la plante magique ");
			gm.playSE(gm.plante);
			
		}else {
			
			//scene 3
			gm.sChanger.showScene3();
		}
		
	
	}
	
	public void voirPlant() {
		gm.ui.messageText.setText("c'est la plante magique");
		
	}
	
	
	public void prendrePlant() {
		if(gm.player.plante==0) {
			gm.ui.messageText.setText("tu as trouver la plainte magique ! \n Tu peux commencer maintenenat ");
			gm.player.plante = 1;
			gm.player.updatePlayerStatus();
			gm.currentMusic = gm.life;
			gm.playSE(gm.currentMusic);
		}else {
			gm.ui.messageText.setText(" yow ta rien");
		}
		
	}
	
	
	public void pourquoiPlant() {
		gm.ui.messageText.setText("c'est pour construire le vaccin  ");
		
	}
	
	

}
