package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileReader;
//import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class UI {
	
	GameManager gm;
	JFrame window ;
	
	public JTextArea messageText ;
	public JPanel bgPanel[]= new JPanel[20];
	public JLabel bgLabel[]=new JLabel[20];
	
	//player
	
	
	JPanel lifePanel;
	JLabel lifeLabel[] = new JLabel[6];
	JPanel inventoryPanel,choixBoutonPanel,choixBoutonPanel2,choixBoutonPanel3,choixBoutonPanel4,choixBoutonPanel5,choixBoutonPanel6;
	
	
	
	 JPanel textPanel[]= new JPanel[1];
	 JPanel logoImagePanel;
	 JPanel nomPlayerPanel;
	 JPanel wrongAnswerTextPanel;
	 JLabel logoImageLabel , nomPlayerLabel;
	 ImageIcon logoImage;
	 
	 JTextField inputName;
	 String name;
	///edits
	 String position;
	  public int nbRemede;
	
	
	
	//----------------------------------
	
	
	public JLabel  planteLabel,nombreRemedeLabel ; 
	
	
	//GAME OVER ! ---------------------------------------------------------------------------------
	public JLabel titleLabel;
	public JButton restartBouton,startBouton,continueBouton,choix1,choix2,choix3,choix4,choix11,choix22,choix33,choix44,
	choix111,choix222,choix333,choix444, 
	choix1111,choix2222,choix3333,choix4444,
	choix11111,choix22222,choix33333,choix44444,
	choix111111,choix222222,choix333333,choix444444
	;
	
	ImageIcon lifeIcon = new ImageIcon(getClass().getClassLoader().getResource("playerHeart.png"));
	ImageIcon planteIcon = new ImageIcon(getClass().getClassLoader().getResource("plant.png"));
	
	
	
	public UI(GameManager gm) {
		
		this.gm=gm;
		
		createMainField();
		createPlayerField();
		createGameOverField();
		generateScene();
		
		
		window.setVisible(true);
		
	}
	
	
	
	public void createMainField() {
		
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		messageText = new JTextArea("");
		messageText.setBounds(50, 410, 700, 150);
		messageText.setBackground(Color.black);
		messageText.setForeground(Color.white);
		messageText.setEditable(false);
		messageText.setLineWrap(true);
		messageText.setWrapStyleWord(true);
		messageText.setFont(new Font("Book Antiqua",Font.PLAIN,26));
		window.add(messageText);
		
		
	}
	
	public void createTextNamePlayer(int bgNum ) {
		
		nomPlayerPanel = new JPanel();
		nomPlayerPanel.setBounds(260, 170,150, 20); // creation d'un espace  pour LE TEXTE 
		nomPlayerPanel.setBackground(Color.blue); 
		nomPlayerPanel.setOpaque(false);
		
		nomPlayerLabel = new JLabel("TAPEZ VOTRE NOM : ");
		nomPlayerLabel.setForeground(Color.WHITE);  // couleur de texte
		//nomPlayerLabel.setFont(titreFont); // font
		nomPlayerPanel.add(nomPlayerLabel);
		 
		//------------------------
		textPanel[bgNum]= new JPanel();
		textPanel[bgNum].setBounds(190,200,300, 100); // creation d'un espace  pour LE TEXTE 
		textPanel[bgNum].setBackground(Color.white); 
		textPanel[bgNum].setOpaque(false);
		
		
		
		 inputName = new JTextField();
		 inputName.setPreferredSize(new Dimension(200, 30));
		 inputName.setFont(new Font("Book Antiqua",Font.PLAIN,20));
		 inputName.setBackground(Color.blue);
		 inputName.setForeground(Color.white);
		 inputName.setOpaque(false);
		 textPanel[bgNum].add(inputName);
		 
		 
		 
			startBouton = new JButton("START");
			startBouton.setBounds(200,300, 100,50);
			startBouton.setBorder(null);
			startBouton.setBackground(null);
			startBouton.setForeground(Color.green);
			startBouton.setFocusPainted(false);
			startBouton.addActionListener(gm.aHandler);
			startBouton.setActionCommand("start");
			startBouton.setVisible(false);
			startBouton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
			startBouton.setFocusPainted(false);
			
			continueBouton = new JButton("CONTINUE");
			continueBouton.setBounds(350,300, 100, 50);
			continueBouton.setBorder(null);
			continueBouton.setBackground(null);
			continueBouton.setForeground(Color.green);
			continueBouton.setFocusPainted(false);
			continueBouton.addActionListener(gm.aHandler);
			continueBouton.setActionCommand("continue");
			continueBouton.setVisible(false);
			continueBouton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			continueBouton.setFocusPainted(false);
			
//			if(startorcontinue.equals("start")) {
//				gm.player.setPlayerDefaultStatus();
//			}
//			if(startorcontinue.equals("continue")) {
//				loadData();
//			}
			
			
			//new  ----------------IMAGE ---------------------------------
			
			logoImagePanel= new JPanel();
			logoImagePanel.setBounds(5, 5, 700, 70);
			logoImagePanel.setBackground(Color.black);
			
			logoImageLabel = new JLabel();
			
			logoImage = new ImageIcon(".//res//logo1.png");// change size icon LOGO !!!
			logoImageLabel.setIcon(logoImage);
			logoImagePanel.add(logoImageLabel);
			
			// ----------------------------------------------
			bgLabel[bgNum].add(logoImagePanel);
			bgLabel[bgNum].add(nomPlayerPanel);
			bgLabel[bgNum].add(startBouton);
			bgLabel[bgNum].add(continueBouton);
		    bgLabel[bgNum].add(textPanel[bgNum]);
		 
		
	}

	
	public void createOptionsAnswersEurope(int bgNum) {
		
		choixBoutonPanel = new JPanel();
		choixBoutonPanel.setBounds(240, 100,200,200);
		choixBoutonPanel.setBackground(null);
		choixBoutonPanel.setLayout(new GridLayout(4,1));
		bgLabel[bgNum].add(choixBoutonPanel);
		
		choix1 = new JButton("CHOIX1");
		choix1.setBackground(null);
		choix1.setForeground(Color.black);
		choix1.setFont(new Font("Times New Roman", 14, 15));
		choix1.setFocusPainted(false);
		choixBoutonPanel.add(choix1);
		choix1.setActionCommand("c1");
		
		
		choix2 = new JButton("CHOIX2");
		choix2.setBackground(null);
		choix2.setForeground(Color.black);
		choix2.setFont(new Font("Times New Roman", 14, 15));
		choix2.setFocusPainted(false);
		choixBoutonPanel.add(choix2);
		choix2.setActionCommand("c2");
		
		choix3 = new JButton("CHOIX 3");
		choix3.setBackground(null);
		choix3.setForeground(Color.black);
		choix3.setFont(new Font("Times New Roman", 14, 15));
		choix3.setFocusPainted(false);
		choixBoutonPanel.add(choix3);
		choix3.setActionCommand("c3");
		
		choix4 = new JButton("CHOIX 4");
		choix4.setBackground(null);
		choix4.setForeground(Color.black);
		choix4.setFont(new Font("Times New Roman", 14, 15));
		choix4.setFocusPainted(false);
		choixBoutonPanel.add(choix4);
		choix4.setActionCommand("c4");
	}
	
	//afrique test bouton choix 
	
public void createOptionsAnswersAfrique(int bgNum) {
		
		choixBoutonPanel2 = new JPanel();
		choixBoutonPanel2.setBounds(240, 100,200,200);
		choixBoutonPanel2.setBackground(null);
		choixBoutonPanel2.setLayout(new GridLayout(4,1));
		bgLabel[bgNum].add(choixBoutonPanel2);
		
		choix11 = new JButton("CHOIX1");
		choix11.setBackground(null);
		choix11.setForeground(Color.black);
		choix11.setFont(new Font("Times New Roman", 14, 15));
		choix11.setFocusPainted(false);
		choixBoutonPanel2.add(choix11);
		choix11.setActionCommand("c11");
		
		choix22 = new JButton("bip");
		choix22.setBackground(null);
		choix22.setForeground(Color.black);
		choix22.setFont(new Font("Times New Roman", 14, 15));
		choix22.setFocusPainted(false);
		choixBoutonPanel2.add(choix22);
		choix22.setActionCommand("c22");
		
		choix33 = new JButton("CHOIX 3");
		choix33.setBackground(null);
		choix33.setForeground(Color.black);
		choix33.setFont(new Font("Times New Roman", 14, 15));
		choix33.setFocusPainted(false);
		choixBoutonPanel2.add(choix33);
		choix33.setActionCommand("c33");
		
		
		choix44 = new JButton("CHOIX 4");
		choix44.setBackground(null);
		choix44.setForeground(Color.black);
		choix44.setFont(new Font("Times New Roman", 14, 15));
		choix44.setFocusPainted(false);
		choixBoutonPanel2.add(choix44);
		choix44.setActionCommand("c44");
		
	}
	
	// finish test bouton 


	//america test bouton choix 

public void createOptionsAnswersAmerica(int bgNum) {
		
		choixBoutonPanel3 = new JPanel();
		choixBoutonPanel3.setBounds(240, 100,200,200);
		choixBoutonPanel3.setBackground(null);
		choixBoutonPanel3.setLayout(new GridLayout(4,1));
		bgLabel[bgNum].add(choixBoutonPanel3);
		
		choix111 = new JButton("CHOIX1");
		choix111.setBackground(null);
		choix111.setForeground(Color.black);
		choix111.setFont(new Font("Times New Roman", 14, 15));
		choix111.setFocusPainted(false);
		choixBoutonPanel3.add(choix111);
		choix111.setActionCommand("c111");
		
		choix222 = new JButton("bip");
		choix222.setBackground(null);
		choix222.setForeground(Color.black);
		choix222.setFont(new Font("Times New Roman", 14, 15));
		choix222.setFocusPainted(false);
		choixBoutonPanel3.add(choix222);
		choix222.setActionCommand("c222");
		
		choix333 = new JButton("CHOIX 3");
		choix333.setBackground(null);
		choix333.setForeground(Color.black);
		choix333.setFont(new Font("Times New Roman", 14, 15));
		choix333.setFocusPainted(false);
		choixBoutonPanel3.add(choix333);
		choix333.setActionCommand("c333");
		
		
		choix444 = new JButton("CHOIX 4");
		choix444.setBackground(null);
		choix444.setForeground(Color.black);
		choix444.setFont(new Font("Times New Roman", 14, 15));
		choix444.setFocusPainted(false);
		choixBoutonPanel3.add(choix444);
		choix444.setActionCommand("c444");
		
	}
	
	// finish test bouton 

//asia test bouton choix 

public void createOptionsAnswersAsia(int bgNum) {
		
		choixBoutonPanel4 = new JPanel();
		choixBoutonPanel4.setBounds(240, 100,200,200);
		choixBoutonPanel4.setBackground(null);
		choixBoutonPanel4.setLayout(new GridLayout(4,1));
		bgLabel[bgNum].add(choixBoutonPanel4);
		
		choix1111 = new JButton("CHOIX1");
		choix1111.setBackground(null);
		choix1111.setForeground(Color.black);
		choix1111.setFont(new Font("Times New Roman", 14, 15));
		choix1111.setFocusPainted(false);
		choixBoutonPanel4.add(choix1111);
		choix1111.setActionCommand("c1111");
		
		choix2222 = new JButton("bip");
		choix2222.setBackground(null);
		choix2222.setForeground(Color.black);
		choix2222.setFont(new Font("Times New Roman", 14, 15));
		choix2222.setFocusPainted(false);
		choixBoutonPanel4.add(choix2222);
		choix2222.setActionCommand("c2222");
		
		choix3333 = new JButton("CHOIX 3");
		choix3333.setBackground(null);
		choix3333.setForeground(Color.black);
		choix3333.setFont(new Font("Times New Roman", 14, 15));
		choix3333.setFocusPainted(false);
		choixBoutonPanel4.add(choix3333);
		choix3333.setActionCommand("c3333");
		
		
		choix4444 = new JButton("CHOIX 4");
		choix4444.setBackground(null);
		choix4444.setForeground(Color.black);
		choix4444.setFont(new Font("Times New Roman", 14, 15));
		choix4444.setFocusPainted(false);
		choixBoutonPanel4.add(choix4444);
		choix4444.setActionCommand("c4444");
		
	}
	
	// finish test bouton 

//asia test bouton choix 

public void createOptionsAnswersAustralia(int bgNum) {
		
		choixBoutonPanel5 = new JPanel();
		choixBoutonPanel5.setBounds(240, 100,200,200);
		choixBoutonPanel5.setBackground(null);
		choixBoutonPanel5.setLayout(new GridLayout(4,1));
		bgLabel[bgNum].add(choixBoutonPanel5);
		
		choix11111 = new JButton("CHOIX1");
		choix11111.setBackground(null);
		choix11111.setForeground(Color.black);
		choix11111.setFont(new Font("Times New Roman", 14, 15));
		choix11111.setFocusPainted(false);
		choixBoutonPanel5.add(choix11111);
		choix11111.setActionCommand("c11111");
		
		choix22222 = new JButton("bip");
		choix22222.setBackground(null);
		choix22222.setForeground(Color.black);
		choix22222.setFont(new Font("Times New Roman", 14, 15));
		choix22222.setFocusPainted(false);
		choixBoutonPanel5.add(choix22222);
		choix22222.setActionCommand("c22222");
		
		choix33333 = new JButton("CHOIX 3");
		choix33333.setBackground(null);
		choix33333.setForeground(Color.black);
		choix33333.setFont(new Font("Times New Roman", 14, 15));
		choix33333.setFocusPainted(false);
		choixBoutonPanel5.add(choix33333);
		choix33333.setActionCommand("c33333");
		
		
		choix44444 = new JButton("CHOIX 4");
		choix44444.setBackground(null);
		choix44444.setForeground(Color.black);
		choix44444.setFont(new Font("Times New Roman", 14, 15));
		choix44444.setFocusPainted(false);
		choixBoutonPanel5.add(choix44444);
		choix44444.setActionCommand("c44444");
		
	}
	
	// finish test bouton 

//asia test bouton choix 

public void createOptionsAnswersAntarctique(int bgNum) {
		
		choixBoutonPanel6 = new JPanel();
		choixBoutonPanel6.setBounds(240, 100,200,200);
		choixBoutonPanel6.setBackground(null);
		choixBoutonPanel6.setLayout(new GridLayout(4,1));
		bgLabel[bgNum].add(choixBoutonPanel6);
		
		choix111111 = new JButton("CHOIX1");
		choix111111.setBackground(null);
		choix111111.setForeground(Color.black);
		choix111111.setFont(new Font("Times New Roman", 14, 15));
		choix111111.setFocusPainted(false);
		choixBoutonPanel6.add(choix111111);
		choix111111.setActionCommand("c111111");
		
		choix222222 = new JButton("bip");
		choix222222.setBackground(null);
		choix222222.setForeground(Color.black);
		choix222222.setFont(new Font("Times New Roman", 14, 15));
		choix222222.setFocusPainted(false);
		choixBoutonPanel6.add(choix222222);
		choix222222.setActionCommand("c222222");
		
		choix333333 = new JButton("CHOIX 3");
		choix333333.setBackground(null);
		choix333333.setForeground(Color.black);
		choix333333.setFont(new Font("Times New Roman", 14, 15));
		choix333333.setFocusPainted(false);
		choixBoutonPanel6.add(choix333333);
		choix333333.setActionCommand("c333333");
		
		
		choix444444 = new JButton("CHOIX 4");
		choix444444.setBackground(null);
		choix444444.setForeground(Color.black);
		choix444444.setFont(new Font("Times New Roman", 14, 15));
		choix444444.setFocusPainted(false);
		choixBoutonPanel6.add(choix444444);
		choix444444.setActionCommand("c444444");
		
	}

	// finish test bouton 



	
	public void createBackground(int bgNum , String bgFileName) {
		
		bgPanel[bgNum] = new JPanel();
		bgPanel[bgNum].setBounds(50, 50, 700, 350);
		bgPanel[bgNum].setBackground(Color.blue);
		bgPanel[bgNum].setLayout(null);
		bgPanel[bgNum].setVisible(false);
		window.add(bgPanel[bgNum]);
		
		bgLabel[bgNum] = new JLabel();
		bgLabel[bgNum].setBounds(0,0,700,350);
		
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
		bgLabel[bgNum].setIcon(bgIcon);
		
	}
	
	
	
	public void createObject(int bgNum , int objx , int oby , int objWidth , int objHeight , String objFileName,
			String choix1Name , String choix2Name, String choix3Name,String choix1Commande , String choix2Commande , String choix3Commande ) {
		
		JPopupMenu popMenu = new JPopupMenu();
		
		JMenuItem menuItem[]= new JMenuItem[4];
		
		menuItem[1] = new JMenuItem(choix1Name);
		menuItem[1].addActionListener(gm.aHandler);
		menuItem[1].setActionCommand(choix1Commande);
		popMenu.add(menuItem[1]);
		
		menuItem[2] = new JMenuItem(choix2Name);
		menuItem[2].addActionListener(gm.aHandler);
		menuItem[2].setActionCommand(choix2Commande);
		popMenu.add(menuItem[2]);
		
		menuItem[3] = new JMenuItem(choix3Name);
		menuItem[3].addActionListener(gm.aHandler);
		menuItem[3].setActionCommand(choix3Commande);
		popMenu.add(menuItem[3]);
		
		
		JLabel objectLabel = new JLabel();
		objectLabel.setBounds(objx, oby, objWidth,objHeight);
		
		ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
		objectLabel.setIcon(objectIcon);
		
		objectLabel.addMouseListener(new MouseListener() {

			
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				
				if(SwingUtilities.isRightMouseButton(e)) {
					popMenu.show(objectLabel,e.getX(),e.getY());
					
				}
			}
			public void mouseReleased(MouseEvent e) {}
			
		});
		bgLabel[bgNum].add(objectLabel);
		
	}
	
	public void createPlayerField() {
		
		lifePanel = new JPanel();
		lifePanel.setBounds(50, 0, 250, 50);
		lifePanel.setBackground(Color.black);
		lifePanel.setLayout(new GridLayout(1,5));
		window.add(lifePanel);
		
	//	ImageIcon lifeIcon = new ImageIcon(getClass().getClassLoader().getResource("playerHeart.png"));
		Image image = lifeIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
		lifeIcon = new ImageIcon(image);
		
		int i=1;
		
		while(i<6) {
			lifeLabel[i] = new JLabel();
			lifeLabel[i].setIcon(lifeIcon);
			lifePanel.add(lifeLabel[i]);
			i++;
		}
		
		inventoryPanel = new JPanel();
		inventoryPanel.setBounds(650, 0, 100, 50);
		inventoryPanel.setBackground(Color.black);
		inventoryPanel.setLayout(new GridLayout(1,3));
		window.add(inventoryPanel);
		
		//create items 
		nombreRemedeLabel = new JLabel();
		nombreRemedeLabel.setText( ""+nbRemede+"/6");
		nombreRemedeLabel.setFont(new Font("Times New Roman", 10, 16));
		nombreRemedeLabel.setForeground(Color.white);
		inventoryPanel.add(nombreRemedeLabel);
		
		//nameLabel= new JLabel(); //
		//nameLabel.setText("ILYASS");
		//nameLabel.setFont(new Font("Times New Roman", 10, 14));
		//nameLabel.setForeground(Color.white);
		//inventoryPanel.add(nameLabel);
		
		
		planteLabel= new JLabel();
		//ImageIcon planteIcon = new ImageIcon(getClass().getClassLoader().getResource("plant.png"));
		image = planteIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
		planteIcon = new ImageIcon(image);
		planteLabel.setIcon(planteIcon);
		inventoryPanel.add(planteLabel);
		
		
	}
	
	public void createGameOverField() {
		titleLabel = new JLabel("",JLabel.CENTER);
		titleLabel.setBounds(200, 150, 400, 200);
		titleLabel.setForeground(Color.red);
		titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 70));
		titleLabel.setVisible(false);
		window.add(titleLabel);
		
		restartBouton = new JButton();
		restartBouton.setBounds(340, 320, 120, 50);
		restartBouton.setBorder(null);
		restartBouton.setBackground(null);
		restartBouton.setForeground(Color.white);
		restartBouton.setFocusPainted(false);
		restartBouton.addActionListener(gm.aHandler);
		restartBouton.setActionCommand("restart");
		restartBouton.setVisible(false);
		window.add(restartBouton);
	}
	
	
	
	public void createArrowBouton(int bgNum , int x , int y , int width , int height ,String arrowFile, String Commande) {
		
		ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource(arrowFile));
		
		JButton arrowBouton = new JButton();
		arrowBouton.setBounds(x, y, width, height);
		arrowBouton.setBackground(null);
		arrowBouton.setContentAreaFilled(false);
		arrowBouton.setFocusPainted(false);
		arrowBouton.setIcon(arrowIcon);
		arrowBouton.addActionListener(gm.aHandler);
		arrowBouton.setActionCommand(Commande);
		arrowBouton.setBorderPainted(false);
		
		bgPanel[bgNum].add(arrowBouton);
		
	}
	


	public void generateScene() {
		
		
		//SCENE 0 
		createBackground(0,"noir.png");
		createTextNamePlayer(0);
		bgPanel[0].add(bgLabel[0]);
		
		
		
		//SCENE 1 
		createBackground(1,"nature.png");
		createObject(1,440, 150, 200, 200, "aaa.png","SAUVEGARDER","PARLER","ENTRER","sauvegarder","parlerLabo","entrerLabo");
		createObject(1,70, 200, 150, 150, "doc1.png","VOIR","PARLER","INSULTER","voirDoc","parlerDoc","insulterDoc");
		createObject(1,310, 280, 100, 100, "box.png","VOIR","PARLER","ENTRER","voirBox","parlerBox","entrerBox");
		createArrowBouton(1, 0, 150, 50, 50, "next.png", "goScene2");
		createArrowBouton(1, 650, 150, 50, 50, "back.png", "goScene0");
		bgPanel[1].add(bgLabel[1]);
		
		//SCENE 2 
		
		createBackground(2,"mapp.png");
		createObject(2,0, 100,300, 300, "map.png","Voir","explique","Commencer","voirMap","expliqueMap","commencerMap");
		createObject(2,400, 236,100, 100, "plant.png","Voir","prendre","pourquoi","voirPlant","prendrePlant","pourquoiPlant");
		createArrowBouton(2, 650, 150, 50, 50, "back.png", "goScene1");
		bgPanel[2].add(bgLabel[2]);
		
		//SCENE 3
		
		createBackground(3,"worldcof.png");
		//createObject(2,0, 100,300, 300, "map.png","Voir","explique","Commencer","voirMap","expliqueMap","commencerMap");
		createObject(3,100, 100,100, 100, "europe.png","Voir","info","sauver","voirEurope","infoEurope","sauverEurope");
		createObject(3,200, 100,100, 100, "africa.png","Voir","info","sauver","voirAfrica","infoAfrica","sauverAfrica");
		createObject(3,300, 100,100, 100, "america.png","Voir","info","sauver","voirAmerica","infoAmerica","sauverAmerica");
		createObject(3,100, 200,100, 100, "asia.png","Voir","info","sauver","voirAsia","infoAsia","sauverAsia");
		createObject(3,200, 200,100, 100, "australia.png","Voir","info","sauver","voirAustralia","infoAustralia","sauverAustralia");
		createObject(3,310, 200,100, 100, "antarctique.png","Voir","info","sauver","voirAntarctique","infoAntarctique","sauverAntarctique");
		createArrowBouton(3, 650, 150, 50, 50, "back.png", "goScene2");
		bgPanel[3].add(bgLabel[3]);
		
		
		//SCENE EUROPE

		createBackground(4,"bg-europe-blur.png");
		createObject(4,0, 50,300, 300, "guard.png","saluer","explique","frapper","saluerGuard","expliqueGuardEurope","frapperGuard");
		createOptionsAnswersEurope(4);
		createArrowBouton(4, 650, 150, 50, 50, "back.png", "goScene3");
		
		bgPanel[4].add(bgLabel[4]);
		
		
		//SCENE Africa
		
		createBackground(5,"bg-blur.png");
		createObject(5,0, 50,300, 300, "guard.png","saluer","explique","frapper","saluerGuard","expliqueGuardAfrica","frapperGuard");
		createOptionsAnswersAfrique(5);
		createArrowBouton(5, 650, 150, 50, 50, "back.png", "goScene3");
		bgPanel[5].add(bgLabel[5]);
		
		
		//SCENE america
		
		createBackground(6,"bg-america-blur.png");
		createObject(6,0, 50,300, 300, "guard.png","saluer","explique","frapper","saluerGuard","expliqueGuardAmerica","frapperGuard");
		createOptionsAnswersAmerica(6);
		createArrowBouton(6, 650, 150, 50, 50, "back.png", "goScene3");
		bgPanel[6].add(bgLabel[6]);
		
		
		//SCENE Asia
		
		createBackground(7,"bg-asia-blur.png");
		createObject(7,0, 50,300, 300, "guard.png","saluer","explique","frapper","saluerGuard","expliqueGuardAsia","frapperGuard");
		createOptionsAnswersAsia(7);
		createArrowBouton(7, 650, 150, 50, 50, "back.png", "goScene3");
		bgPanel[7].add(bgLabel[7]);
		
		
		//SCENE australia
		
		createBackground(8,"bg-australia-blur.png");
		createObject(8,0, 50,300, 300, "guard.png","saluer","explique","frapper","saluerGuard","expliqueGuardAustralia","frapperGuard");
		createOptionsAnswersAustralia(8);
		createArrowBouton(8, 650, 150, 50, 50, "back.png", "goScene3");
		bgPanel[8].add(bgLabel[8]);
		
		
		//SCENE Antarctique
		
		createBackground(9,"bg-antratica-blur.png");
		createObject(9,0, 50,300, 300, "guard.png","saluer","explique","frapper","saluerGuard","expliqueGuardAntarctique","frapperGuard");
		createOptionsAnswersAntarctique(9);
		createArrowBouton(9, 650, 150, 50, 50, "back.png", "goScene3");
		bgPanel[9].add(bgLabel[9]);
		
		//scene fausse reponse 
		
		createBackground(10,"green.png");
		createArrowBouton(10, 650, 150, 50, 50, "back.png", "goScene3");
		bgPanel[10].add(bgLabel[10]);
		
		//win scene
		createBackground(11,"gagner.jpeg");
		createArrowBouton(11, 650, 150, 50, 50, "back.png", "goScene3");
		bgPanel[11].add(bgLabel[11]);
		
		
		//create save GAME
		
		createBackground(12,"green.png");
		createArrowBouton(12, 650, 150, 50, 50, "back.png", "goScene3");
		bgPanel[12].add(bgLabel[12]);
	}
	
	
	public void loadData() {
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("saveGame.txt"));
			gm.player.playerLife = Integer.parseInt(br.readLine());
			gm.player.plante = Integer.parseInt(br.readLine());
			nbRemede = Integer.parseInt(br.readLine());
			
			br.close();
			
		} catch (Exception e) {
			
		}
		nombreRemedeLabel.setText(""+nbRemede+"/6");
		lifeLabel[gm.player.playerLife].setIcon(lifeIcon);
		planteLabel.setIcon(planteIcon);
		
		gm.sChanger.showScene1();
		
	}
	
	
	
	
}