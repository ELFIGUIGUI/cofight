package Main;

import java.net.URL;

import Event.Event01;
import Event.Event02;
import Event.Event03;

public class GameManager {
	
	ActionHandler aHandler = new ActionHandler(this);
	
	public UI ui = new UI(this);
	public Player player = new Player(this);
	public SceneChanger sChanger= new SceneChanger(this);
	Music music = new Music();
	SE se = new SE();
	
	
	
	
	public Event01 ev1 = new Event01(this);
	public Event02 ev2 = new Event02(this);
	public Event03 ev3 = new Event03(this);
	
	
	//sound
	public URL fieldMusic = getClass().getClassLoader().getResource("audio//bensound-energy.wav");
	public URL fieldMusic2 = getClass().getClassLoader().getResource("audio//acoustic.wav");
	public URL quiz= getClass().getClassLoader().getResource("audio//quiz1.wav");
	public URL quizasia= getClass().getClassLoader().getResource("audio//asiaquiz.wav");
	public URL quizafrica= getClass().getClassLoader().getResource("audio//africaquiz1.wav");
	public URL quizamerica= getClass().getClassLoader().getResource("audio//americaquiz.wav");
	public URL quizantarctque= getClass().getClassLoader().getResource("audio//antarctiquequiz.wav");
	public URL quizaustralia= getClass().getClassLoader().getResource("audio//australiaquiz.wav");
	public URL docteur = getClass().getClassLoader().getResource("audio//docteur.wav");
	public URL life = getClass().getClassLoader().getResource("audio//life.wav");
	public URL fulllife = getClass().getClassLoader().getResource("audio//lifefull.wav");
	//public URL bouton = getClass().getClassLoader().getResource("audio//bouton1.wav");
	public URL gameOver = getClass().getClassLoader().getResource("audio//perdue.wav");
	public URL plante = getClass().getClassLoader().getResource("audio//plante.wav");
	public URL gardien = getClass().getClassLoader().getResource("audio//gardien.wav");
	public URL good = getClass().getClassLoader().getResource("audio//good.wav");
	public URL faux = getClass().getClassLoader().getResource("audio//false.wav");
	public URL europe = getClass().getClassLoader().getResource("audio//europe.wav");
	public URL africa = getClass().getClassLoader().getResource("audio//africa.wav");
	public URL america = getClass().getClassLoader().getResource("audio//america.wav");
	public URL asia = getClass().getClassLoader().getResource("audio//asia.wav");
	public URL australia = getClass().getClassLoader().getResource("audio//australia.wav");
	public URL antarctique = getClass().getClassLoader().getResource("audio//antarctique.wav");
	
	//public URL fieldMusic3 = getClass().getClassLoader().getResource("audio//plante.wav");
	
	public URL currentMusic;
	
	public static void main(String[] args) {
		
		
		new GameManager();
		
	}
	
	public GameManager() {
		
		currentMusic = fieldMusic;
		playMusic(currentMusic);
		
		player.setPlayerDefaultStatus();
		sChanger.showScene0();
		
		
	}
	
	public void playSE(URL url) {
		se.setFile(url);
		se.play(url);
	}
	
	public void playMusic(URL url) {
		music.setFile(url);
		music.setFile(url);
		music.loop(url);
	}
	
	public void stopMusic(URL url) {
		
		music.stop(url);
		
	}

}