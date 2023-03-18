package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener{
	
	GameManager gm ; 
	public ActionHandler(GameManager gm ) {
		
		
		this.gm=gm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String votreChoix = e.getActionCommand();
		
		switch(votreChoix) {
		// SCENE 1 
		case"sauvegarder" 	: gm.ev1.sauvegarder(); break;
		case"parlerLabo" : gm.ev1.parlerLabo(); break;
		case"entrerLabo" : gm.ev1.entrerLabo(); break;
		
		
		
		case"voirBox" : gm.ev1.voirBox(); break;
		case"parlerBox" : gm.ev1.parlerBox(); break;
		case"entrerBox" : gm.ev1.entrerBox(); break;
		
		case"voirDoc" : gm.ev1.voirDoc(); break;
		case"parlerDoc" : gm.ev1.parlerDoc(); break;
		case"insulterDoc" : gm.ev1.insulterDoc(); break;
		//SCENE 2 
		case"voirMap" : gm.ev2.voirMap(); break;
		case"expliqueMap" : gm.ev2.expliqueMap(); break;
		case"commencerMap" : gm.ev2.commencerMap(); break;
		
		case"voirPlant" : gm.ev2.voirPlant(); break;
		case"prendrePlant" : gm.ev2.prendrePlant(); break;
		case"pourquoiPlant" : gm.ev2.pourquoiPlant(); break;
		
		//scene gardien 
		
		case"saluerGuard"  :            gm.ev1.saluerGuard(); break;
		case"expliqueGuardEurope" :      gm.ev1.expliqueGuardEurope(); break;
		case"expliqueGuardAfrica" :      gm.ev1.expliqueGuardAfrica(); break;
		case"expliqueGuardAmerica" :     gm.ev1.expliqueGuardAmerica(); break;
		case"expliqueGuardAsia" :        gm.ev1.expliqueGuardAsia(); break;
		case"expliqueGuardAustralia" :   gm.ev1.expliqueGuardAustralia(); break;
		case"expliqueGuardAntarctique" : gm.ev1.expliqueGuardAntarctique(); break;
		
		case"frapperGuard" : gm.ev1.frapperGuard(); break;
		
		
		//SCENE 3 
		//EUROPE
		case"voirEurope" : gm.ev3.voirEurope(); break;
		case"infoEurope" : gm.ev3.infoEurope(); break;
		case"sauverEurope" : gm.ev3.sauverEurope(); break;
		
		//AFRIQUE
		
		case"voirAfrica" : gm.ev3.voirAfrica(); break;
		case"infoAfrica" : gm.ev3.infoAfrica(); break;
		case"sauverAfrica" : gm.ev3.sauverAfrica(); break;
		
		
		//AMERICA
		
		case"voirAmerica" : gm.ev3.voirAmerica(); break;
		case"infoAmerica" : gm.ev3.infoAmerica(); break;
		case"sauverAmerica" : gm.ev3.sauverAmerica(); break;
		
		
		//ASIA
		case"voirAsia" : gm.ev3.voirAsia(); break;
		case"infoAsia" : gm.ev3.infoAsia(); break;
		case"sauverAsia" : gm.ev3.sauverAsia(); break;
		
		//AUSTRALIA
		case"voirAustralia" : gm.ev3.voirAustralia(); break;
		case"infoAustralia" : gm.ev3.infoAustralia(); break;
		case"sauverAustralia" : gm.ev3.sauverAustralia(); break;
		
		//Antarctique
		case"voirAntarctique" : gm.ev3.voirAntarctique(); break;
		case"infoAntarctique" : gm.ev3.infoAntarctique(); break;
		case"sauverAntarctique" : gm.ev3.sauverAntarctique(); break;
		
		
		
		
		
		
		
		//change scenes1 case 
		case"goScene0" : gm.sChanger.showScene0();break;
		case"goScene1" : gm.sChanger.showScene1();break;
		case"goScene2" : gm.sChanger.showScene2();break;
		case"goScene3" : gm.sChanger.showScene3();break;
		case"goScene4" : gm.sChanger.showSceneEurope();;break;
		case"goScene5" : gm.sChanger.showSceneAfrica();break;
		case"goScene6" : gm.sChanger.showSceneAmerica();break;
		case"goScene7" : gm.sChanger.showSceneAsia();break;
		case"goScene8" : gm.sChanger.showSceneAustralia();break;
		case"goScene9" : gm.sChanger.showSceneAntarctique();break;
		case"goScene10" : gm.sChanger.showScenewrongAnswer();break;
		
		
		//autre
		case"start" : gm.sChanger.showScene1();  break;
		case"restart" : gm.sChanger.existGameOverScreen();  gm.sChanger.showScene1(); break;
		case"continue" :   gm.sChanger.showScene1(); break;
		
		}
		
	}

}
