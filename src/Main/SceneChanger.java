package Main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SceneChanger {
	
	GameManager gm;
	String position;
	
	ChoixHandler choixHandler = new ChoixHandler();
	
	public SceneChanger(GameManager gm) {
	
		this.gm=gm;
		
		
	}
	
	
public void showScene0() {
	    
		gm.ui.lifePanel.setVisible(false);
		gm.ui.inventoryPanel.setVisible(false);
		gm.ui.createTextNamePlayer(0);
		gm.ui.startBouton.setVisible(true);
		gm.ui.continueBouton.setVisible(true);
		gm.ui.bgPanel[0].setVisible(true);
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[6].setVisible(false);
		gm.ui.bgPanel[7].setVisible(false);
		gm.ui.bgPanel[8].setVisible(false);
		gm.ui.bgPanel[9].setVisible(false);
		//gm.ui.messageText.setText("                      BIENVENUE AU CO-FIGHT   \n OPTION : clique droit souris \n Choisi : clique gauche souris ");
		
		
	}
	
	
	public void showScene1() {
		gm.ui.lifePanel.setVisible(true);
		gm.ui.inventoryPanel.setVisible(true);
		gm.ui.bgPanel[0].setVisible(false);
		gm.ui.bgPanel[1].setVisible(true);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.messageText.setText("PARLER AVEC LE SCIENTIFIQUE !");
		
		//musique
		gm.stopMusic(gm.currentMusic);
	
		//-------------------------------
	}
	
	public void showScene2() {
		
		gm.stopMusic(gm.currentMusic);
		
		gm.ui.lifePanel.setVisible(true);
		gm.ui.inventoryPanel.setVisible(true);
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[9].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.messageText.setText("Cliquer sur LA MAP ");
		
		
		
		
	}
	
	
	public void showScene3() {
		
		gm.ui.lifePanel.setVisible(true);
		gm.ui.inventoryPanel.setVisible(true);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[6].setVisible(false);
		gm.ui.bgPanel[7].setVisible(false);
		gm.ui.bgPanel[8].setVisible(false);
		gm.ui.bgPanel[9].setVisible(false);
		gm.ui.bgPanel[3].setVisible(true);
		gm.ui.messageText.setText("                  LA CARTE DU MONDE  \nCLIQUE DROIT SOURIS SUR LE CONTINENT SOUHAITÉ  " );
		
		//musique 
		gm.stopMusic(gm.currentMusic);
//		gm.currentMusic = gm.quiz;
//		gm.playMusic(gm.currentMusic);
		//---------------------------
		
	}
	
	public void showSceneEurope() {
		
		position="europe";
		gm.ui.choix1.addActionListener(choixHandler);
		gm.ui.choix2.addActionListener(choixHandler);
		gm.ui.choix3.addActionListener(choixHandler);
		gm.ui.choix4.addActionListener(choixHandler);
		
		gm.ui.choix1.setText("Janvier 2020"); gm.ui.choix1.setActionCommand("c1");
		gm.ui.choix2.setText("Mars 2020"); gm.ui.choix2.setActionCommand("c2");
		gm.ui.choix3.setText("Fevrier 2020"); gm.ui.choix3.setActionCommand("c3");
		gm.ui.choix4.setText("Decembre 2019"); gm.ui.choix4.setActionCommand("c4");
		
		
		gm.ui.createOptionsAnswersEurope(4);
		gm.ui.lifePanel.setVisible(true);
		gm.ui.inventoryPanel.setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(true);
		gm.ui.messageText.setText(" DEMANDER AU GARDIEN DE T'EXPLIQUER LA QUESTION  clique droit 'souris' ");
		
		gm.currentMusic = gm.quiz;
		gm.playMusic(gm.currentMusic);
		
	}
	
	public void showSceneAfrica() {
		
		
		position="afrique";
		
		gm.ui.choix11.addActionListener(choixHandler);
		gm.ui.choix22.addActionListener(choixHandler);
		gm.ui.choix33.addActionListener(choixHandler);
		gm.ui.choix44.addActionListener(choixHandler);
		
		
		
		gm.ui.choix11.setText("12h"); gm.ui.choix11.setActionCommand("c11");
		gm.ui.choix22.setText("8h"); gm.ui.choix22.setActionCommand("c22");
		gm.ui.choix33.setText("4h"); gm.ui.choix33.setActionCommand("c33");
		gm.ui.choix44.setText("24h"); gm.ui.choix44.setActionCommand("c44");
		
	gm.ui.createOptionsAnswersAfrique(5);
	gm.ui.lifePanel.setVisible(true);
	gm.ui.inventoryPanel.setVisible(true);
	gm.ui.bgPanel[3].setVisible(false);
	gm.ui.bgPanel[4].setVisible(false);
	gm.ui.bgPanel[5].setVisible(true);
	gm.ui.messageText.setText("DEMANDER AU GARDIEN DE T'EXPLIQUER LA QUESTION clique droit 'souris' ");
	gm.stopMusic(gm.currentMusic);
	gm.currentMusic = gm.quizafrica;
	gm.playMusic(gm.currentMusic);
	
	

	}
	
	public void showSceneAmerica() {
		
		position="america";
		
		gm.ui.choix111.addActionListener(choixHandler);
		gm.ui.choix222.addActionListener(choixHandler);
		gm.ui.choix333.addActionListener(choixHandler);
		gm.ui.choix444.addActionListener(choixHandler);
		
		gm.ui.choix111.setActionCommand("c111");
		gm.ui.choix111.setText("30 secondes"); gm.ui.choix111.setActionCommand("c111");
		gm.ui.choix222.setText("3 min"); gm.ui.choix222.setActionCommand("c222");
		gm.ui.choix333.setText("2 min"); gm.ui.choix333.setActionCommand("c333");
		gm.ui.choix444.setText("15 min");gm.ui.choix444.setActionCommand("c444");
		
		gm.ui.createOptionsAnswersAfrique(6);
		gm.ui.lifePanel.setVisible(true);
		gm.ui.inventoryPanel.setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[6].setVisible(true);
		gm.ui.messageText.setText("DEMANDER AU GARDIEN DE T'EXPLIQUER LA QUESTION clique droit 'souris'");
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.quizamerica;
		gm.playMusic(gm.currentMusic);
		
	}
	
	public void showSceneAsia() {
		
		position="asia";
		
		gm.ui.choix1111.addActionListener(choixHandler);
		gm.ui.choix2222.addActionListener(choixHandler);
		gm.ui.choix3333.addActionListener(choixHandler);
		gm.ui.choix4444.addActionListener(choixHandler);
		
		
		gm.ui.choix1111.setText("Pékin"); gm.ui.choix1111.setActionCommand("c1111");
		gm.ui.choix2222.setText("Wuhan"); gm.ui.choix2222.setActionCommand("c2222");
		gm.ui.choix3333.setText("Shanghai"); gm.ui.choix3333.setActionCommand("c3333");
		gm.ui.choix4444.setText("Tianjin");gm.ui.choix4444.setActionCommand("c4444");
		
		gm.ui.createOptionsAnswersAsia(7);
		gm.ui.lifePanel.setVisible(true);
		gm.ui.inventoryPanel.setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[6].setVisible(false);
		gm.ui.bgPanel[7].setVisible(true);
		gm.ui.messageText.setText("DEMANDER AU GARDIEN DE T'EXPLIQUER LA QUESTION \n clique droit 'souris' ");
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.quizasia;
		gm.playMusic(gm.currentMusic);
	}

	public void showSceneAustralia() {
		
		
		position="australia";
		gm.ui.choix11111.addActionListener(choixHandler);
		gm.ui.choix22222.addActionListener(choixHandler);
		gm.ui.choix33333.addActionListener(choixHandler);
		gm.ui.choix44444.addActionListener(choixHandler);
		
		
		gm.ui.choix11111.setText("la GRIPPE ESPAGNOLE"); gm.ui.choix11111.setActionCommand("c11111");
		gm.ui.choix22222.setText("le VIH"); gm.ui.choix22222.setActionCommand("c22222");
		gm.ui.choix33333.setText("le COVID-19"); gm.ui.choix33333.setActionCommand("c33333");
		gm.ui.choix44444.setText("le CHOLERA "); gm.ui.choix44444.setActionCommand("c44444");
		
		gm.ui.createOptionsAnswersAustralia(8);
		gm.ui.lifePanel.setVisible(true);
		gm.ui.inventoryPanel.setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[7].setVisible(false);
		gm.ui.bgPanel[8].setVisible(true);
		gm.ui.messageText.setText("DEMANDER AU GARDIEN DE T'EXPLIQUER LA QUESTION clique droit 'souris' ");
		
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.quizaustralia;
		gm.playMusic(gm.currentMusic);
		
	}
	
	public void showSceneAntarctique() {
		
		
		position="antarctique";
		gm.ui.choix111111.addActionListener(choixHandler);
		gm.ui.choix222222.addActionListener(choixHandler);
		gm.ui.choix333333.addActionListener(choixHandler);
		gm.ui.choix444444.addActionListener(choixHandler);
		
		
		
		
		gm.ui.choix111111.setText("10 jours"); gm.ui.choix111111.setActionCommand("c111111");
		gm.ui.choix222222.setText("20 jours"); gm.ui.choix222222.setActionCommand("c222222");
		gm.ui.choix333333.setText("14 jours"); gm.ui.choix333333.setActionCommand("c333333");
		gm.ui.choix444444.setText("5 jours"); gm.ui.choix444444.setActionCommand("c444444");
		
		gm.ui.createOptionsAnswersAntarctique(9);
		gm.ui.lifePanel.setVisible(true);
		gm.ui.inventoryPanel.setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[8].setVisible(false);
		gm.ui.bgPanel[9].setVisible(true);
		gm.ui.messageText.setText("DEMANDER AU GARDIEN DE T'EXPLIQUER LA QUESTION  clique droit 'souris' ");
		
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.quizantarctque;
		gm.playMusic(gm.currentMusic);
		
	}
	
	
	public void showScenewrongAnswer() {
		
		
		gm.ui.lifePanel.setVisible(true);
		gm.ui.inventoryPanel.setVisible(true);
		gm.ui.bgPanel[3].setVisible(false);
		
		gm.ui.bgPanel[10].setVisible(false);
		gm.ui.messageText.setText("YOW , Fausse Réponse ");
		
		
		
		
		
	}
	
	
	public void showSceneWin() {
		
		
		gm.ui.lifePanel.setVisible(false);
		gm.ui.inventoryPanel.setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[9].setVisible(false);
		gm.ui.bgPanel[10].setVisible(false);
		gm.ui.bgPanel[11].setVisible(true);
		gm.ui.messageText.setText("Super , tu as sauvé le monde \n  MERCI  ");
		
		gm.ui.bgPanel[0].setVisible(false);
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(false);
		gm.ui.bgPanel[4].setVisible(false);
		gm.ui.bgPanel[5].setVisible(false);
		gm.ui.bgPanel[6].setVisible(false);
		gm.ui.bgPanel[7].setVisible(false);
		gm.ui.bgPanel[8].setVisible(false);
		gm.ui.bgPanel[9].setVisible(false);
		
	}

	
	

	
	

	public void showGameOverScreen(int CurrentbgNum) {
		
	gm.ui.bgPanel[CurrentbgNum].setVisible(false);	
	gm.ui.titleLabel.setVisible(true);
	gm.ui.titleLabel.setText("TU AS PERDU !");
	gm.ui.titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 50));            
	gm.ui.restartBouton.setVisible(true);
	gm.ui.restartBouton.setText(" RECOMMENCER ");
	gm.ui.restartBouton.setFont(new Font("Times New Roman", Font.PLAIN, 12));  
	
	gm.ui.lifePanel.setVisible(false);
	gm.ui.inventoryPanel.setVisible(false);
	
	gm.ui.bgPanel[0].setVisible(false);
	gm.ui.bgPanel[1].setVisible(false);
	gm.ui.bgPanel[2].setVisible(false);
	gm.ui.bgPanel[3].setVisible(false);
	gm.ui.bgPanel[4].setVisible(false);
	gm.ui.bgPanel[5].setVisible(false);
	gm.ui.bgPanel[6].setVisible(false);
	gm.ui.bgPanel[7].setVisible(false);
	gm.ui.bgPanel[8].setVisible(false);
	gm.ui.bgPanel[9].setVisible(false);
	
	//musique
	//gm.stopMusic(gm.currentMusic);
	gm.playSE(gm.gameOver); 
	}
	
	public void existGameOverScreen() {
		gm.ui.titleLabel.setVisible(false);
		gm.ui.restartBouton.setVisible(false);
		
		gm.player.setPlayerDefaultStatus();
		
	}
	
	public class ChoixHandler implements ActionListener{
		public void actionPerformed (ActionEvent event) {
			
			String votreChoix = event.getActionCommand();//clicked bouton
		
			
			if(votreChoix.equals("c1")) {
				
				gm.ui.nbRemede=gm.ui.nbRemede+1;
		    	gm.ui.nombreRemedeLabel.setText( ""+gm.ui.nbRemede+"/6");
		    	gm.playSE(gm.good);
		    	
				gm.player.updatePlayerStatus();
				
				if(gm.ui.nbRemede>=6) {
		    		gm.sChanger.showSceneWin();		
			    	}else {
			    		showScene3();
			    	}
				
			}
			
		if(votreChoix.equals("c2")) {
			
			if(gm.player.playerLife!=1) {
				
				gm.ui.messageText.setText("  VIE -1  ");
				gm.player.playerLife--;
				gm.player.updatePlayerStatus();
				gm.playSE(gm.faux);
				
			}else if(gm.player.playerLife==1)
				 {
					gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
					gm.player.playerLife--;
					gm.sChanger.showGameOverScreen(1);
				}
			
	    	showScenewrongAnswer();
		}
		
		if(votreChoix.equals("c3")) {
			
			if(gm.player.playerLife!=1) {
				
				gm.ui.messageText.setText("  VIE -1  ");
				gm.player.playerLife--;
				gm.player.updatePlayerStatus();
				gm.playSE(gm.faux);
				
			}else if(gm.player.playerLife==1)
				 {
					gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
					gm.player.playerLife--;
					gm.sChanger.showGameOverScreen(1);
				}
	    	showScenewrongAnswer();
		}
		if(votreChoix.equals("c4")) {
			
			if(gm.player.playerLife!=1) {
				
				gm.ui.messageText.setText("   VIE -1 ");
				gm.player.playerLife--;
				gm.player.updatePlayerStatus();
				gm.playSE(gm.faux);
				
			}else if(gm.player.playerLife==1)
				 {
					gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
					gm.player.playerLife--;
					gm.sChanger.showGameOverScreen(1);
				}
	    	showScenewrongAnswer();
		}

			
	
			if(votreChoix.equals("c33")) {
				
				gm.ui.nbRemede=gm.ui.nbRemede+1;
		    	gm.ui.nombreRemedeLabel.setText( ""+gm.ui.nbRemede+"/6");

				gm.player.updatePlayerStatus();
				gm.playSE(gm.good);
				if(gm.ui.nbRemede>=6) {
		    		gm.sChanger.showSceneWin();		
			    	}else {
			    		showScene3();
			    	}
				
				
			
			}
			if(votreChoix.equals("c22")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1  ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c11")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1  ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c44")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1  ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			

			
			if(votreChoix.equals("c111")) {
				
				gm.ui.nbRemede=gm.ui.nbRemede+1;
		    	gm.ui.nombreRemedeLabel.setText( ""+gm.ui.nbRemede+"/6");

				gm.player.updatePlayerStatus();
				gm.playSE(gm.good);
				if(gm.ui.nbRemede>=6) {
		    		gm.sChanger.showSceneWin();		
			    	}else {
			    		showScene3();
			    	}
				
			
			}
			if(votreChoix.equals("c222")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1 ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c333")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("  VIE -1  ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c444")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1 ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}

			
			if(votreChoix.equals("c2222")) {
				
				gm.ui.nbRemede=gm.ui.nbRemede+1;
		    	gm.ui.nombreRemedeLabel.setText( ""+gm.ui.nbRemede+"/6");

				gm.player.updatePlayerStatus();
				gm.playSE(gm.good);
				if(gm.ui.nbRemede>=6) {
		    		gm.sChanger.showSceneWin();		
			    	}else {
			    		showScene3();
			    	}
				
			
			}
			if(votreChoix.equals("c1111")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1 ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c3333")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("  VIE -1 ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c4444")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("  VIE -1 ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}

			
			if(votreChoix.equals("c11111")) {
				
				gm.ui.nbRemede=gm.ui.nbRemede+1;
		    	gm.ui.nombreRemedeLabel.setText( ""+gm.ui.nbRemede+"/6");

				gm.player.updatePlayerStatus();
				gm.playSE(gm.good);
				if(gm.ui.nbRemede>=6) {
		    		gm.sChanger.showSceneWin();		
			    	}else {
			    		showScene3();
			    	}
				
			
			}
			if(votreChoix.equals("c22222")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("  VIE -1  ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c33333")) {
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1  ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c44444")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1 ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}

			
			if(votreChoix.equals("c444444")) {
				
				gm.ui.nbRemede=gm.ui.nbRemede+1;
		    	gm.ui.nombreRemedeLabel.setText( ""+gm.ui.nbRemede+"/6");
		    	
		    	
				gm.player.updatePlayerStatus();
				gm.playSE(gm.good);
				if(gm.ui.nbRemede>=6) {
		    		gm.sChanger.showSceneWin();		
			    	}else {
			    		showScene3();
			    	}
				
			
			}
			if(votreChoix.equals("c222222")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1  ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c333333")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1  ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}
			if(votreChoix.equals("c111111")) {
				
				if(gm.player.playerLife!=1) {
					
					gm.ui.messageText.setText("   VIE -1  ");
					gm.player.playerLife--;
					gm.player.updatePlayerStatus();
					gm.playSE(gm.faux);
				}else if(gm.player.playerLife==1)
					 {
						gm.ui.messageText.setText(" scientifique :  oops tu es mort  ");
						gm.player.playerLife--;
						gm.sChanger.showGameOverScreen(1);
					}
		    	showScenewrongAnswer();
			}

		
		
				
	
	
	
}
	}
}
