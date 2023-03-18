package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoixHandler implements ActionListener {
	
	
	GameManager gm ;
	public ChoixHandler(GameManager gm) {
		this.gm=gm;
	}
		
	

	


	public void actionPerformed (ActionEvent event) {
	
			String votreChoix = event.getActionCommand();//clicked bouton
		
			
			switch(votreChoix) {
			
			case"showSceneEurope" : 
				switch(gm.ui.position) {
				case"c1": 
					gm.ui.nbRemede++;
					gm.player.updatePlayerStatus();
					break;
				}
			
			}
			
	}
	
	
	
}