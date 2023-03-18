package Event;

import Main.GameManager;

public class Event01 {
	
	GameManager gm;
	
	public Event01(GameManager gm) {
		// TODO Auto-generated constructor stub
		
		this.gm=gm;
	}
	
	public void sauvegarder() {
		gm.ui.messageText.setText("  Jeu Sauvegardé");
		
	}
	  
	public void parlerLabo() {
		gm.ui.messageText.setText("Oui je suis moi");
	}
	public void entrerLabo() {
		if(gm.ui.nbRemede == 6)
		{
			gm.ui.messageText.setText("Ohh vous avez reussis entre le scintifique vous attend !");
		}
		else
		{
			gm.ui.messageText.setText("Vous devez apportez tout les composants pour preparer le vaccin");
		}
		
	}
	
	public void voirBox() {
		
		if(gm.player.playerLife != gm.player.playerMaxLife) {
			gm.ui.messageText.setText("VIE +");
			gm.player.playerLife++;
			gm.player.updatePlayerStatus();
			
			gm.currentMusic = gm.life;
			gm.playSE(gm.currentMusic);
		}else {
			gm.ui.messageText.setText("VIE PLEINE");
			gm.currentMusic = gm.fulllife;
			gm.playSE(gm.currentMusic);
		}
		
	}
	  
	public void parlerBox() {
		gm.ui.messageText.setText("Oui Il faut passer les missions");
	}
	public void entrerBox() {
		gm.ui.messageText.setText("Bienvenue!");
		
	}
	
	public void voirDoc() {
		gm.ui.messageText.setText("C'est le Scientifique");
	}
	  
	public void parlerDoc() {
		gm.ui.messageText.setText("Scientifique : (PARLE) ");
		gm.currentMusic = gm.docteur;
		gm.playSE(gm.currentMusic);
	}
	public void insulterDoc() {
		
		if(gm.player.playerLife!=1) {
			
			gm.ui.messageText.setText(" Scientifique : Manque de respect \n  VIE -1  ");
			gm.player.playerLife--;
			gm.player.updatePlayerStatus();
			
		}else if(gm.player.playerLife==1)
			 {
				gm.ui.messageText.setText(" Scientifique :  désolé  ");
				gm.player.playerLife--;
				gm.sChanger.showGameOverScreen(1);
			}
		
	}
	
	public void saluerGuard() {
		gm.ui.messageText.setText("Gardien : Ne parle pas avec moi");
	}
	  
	public void expliqueGuardEurope() {
		
		gm.ui.messageText.setText("Gardien : Quand est apparu le premier cas covid en France ?");
		gm.playSE(gm.europe);
				
	}
	public void expliqueGuardAfrica() {
		
		gm.ui.messageText.setText("Gardien : Combien de temps le coronavirus survit-il dans l’air  ?");	
		gm.playSE(gm.africa);
	}
	
	public void expliqueGuardAmerica() {
		
		gm.ui.messageText.setText("Gardien : Pendant combien de temps devez-vous vous laver les mains  pour tuer le virus responsable de la maladie à coronavirus ?");
		gm.playSE(gm.america);
	}
	
	public void expliqueGuardAsia() {
		
		gm.ui.messageText.setText("Gardien : Où ce virus est-il apparu ?");
		gm.playSE(gm.asia);
				
	}
	
	public void expliqueGuardAustralia() {
		
		gm.ui.messageText.setText("Gardien :Quelle est l’épidémie la plus meurtrière depuis 1900 ?");
		gm.playSE(gm.australia);
	}
	
	public void expliqueGuardAntarctique() {
		
		gm.ui.messageText.setText("Gardien : Quelle est la durée moyenne d’incubation du Covid-19 ?");
		gm.playSE(gm.antarctique);
	}
	
	
	
	
	
	public void frapperGuard() {
		
		if(gm.player.playerLife!=1) {
			
			gm.ui.messageText.setText(" Gardien : tu es FRAGILE \n  VIE -1  ");
			gm.player.playerLife--;
			gm.player.updatePlayerStatus();
			gm.playSE(gm.gardien);
			
		}else if(gm.player.playerLife==1)
			 {
				gm.ui.messageText.setText(" Gardien : HAHAHA  ");
				gm.player.playerLife--;
				gm.sChanger.showGameOverScreen(1);
			}
		
	}

}
