package view;

import controller.PlaylistCtrl;
import model.Brano;
import model.Playlist;

public class Main {
	
	public static void main(String[] args) {
		
		Playlist miaPlaylist = new Playlist("rock '70");
//		Brano nuovoBrano = new Brano("Immigrant song", "Led Zeppelin", 4.5);
//		Brano nuovoBrano2  = new Brano("Breathe", "Pink Floyd", 5.2);
//		
//		miaPlaylist.addBrano(nuovoBrano);
//		miaPlaylist.addBrano(nuovoBrano2);
		
//		PlaylistCtrl database = new PlaylistCtrl();
//		database.caricaCanzoni();
//		database.stampaBraniPL();
//		database.caricaCanzoniDaFile();
		
		PlaylistCtrl db = new PlaylistCtrl();
		db.caricaCanzoniDaFile();
		System.out.println("Stai stampando tutti i brani disponibili !!");
		db.stampaBraniPL();
		
		miaPlaylist.addBrano(db.getSingolobrano(0));
		miaPlaylist.addBrano(db.getSingolobrano(12));
		miaPlaylist.addBrano(db.getSingolobrano(64));
		miaPlaylist.addBrano(db.getSingolobrano(0));
		miaPlaylist.addBrano(db.getSingolobrano(64));
		
		miaPlaylist.infoPlaylist();
		
	}

}
