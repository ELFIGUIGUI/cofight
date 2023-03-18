package Main;

import javax.swing.JTextField;

public class Player {
	
	
	GameManager gm;
	
	public int playerMaxLife;
	public int playerLife;
	public int plante ;
	
	
	
	public String name;
	
	public JTextField inputName;
	
	
	
	
	public Player(GameManager gm) {
		this.gm=gm;
		
	}

	public void setPlayerDefaultStatus() {
		plante = 0;
		playerMaxLife = 5 ;
		playerLife = 3;
		gm.ui.nbRemede=0;
		
		
		
		
		updatePlayerStatus();
	}
	
	public void updatePlayerStatus() {
		
		//remove life icon 
		
		int i = 1; 
		while(i<6) {
			
			gm.ui.lifeLabel[i].setVisible(false);
			i++;
		}
		
		int lifeCount = playerLife;
		while(lifeCount!=0) {
			gm.ui.lifeLabel[lifeCount].setVisible(true);
			lifeCount--;
		}
		
		//check plante
		if(plante==0) {
			gm.ui.planteLabel.setVisible(false);
	}
		
		if(plante==1) {
			gm.ui.planteLabel.setVisible(true);
	}
		
//		if(gm.ui.nbRemede>=6) {
//		gm.sChanger.showSceneWin();	
//			
//		}
//		
		
		
	}
	
}
