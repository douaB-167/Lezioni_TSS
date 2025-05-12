package view;

import model.Brano;
import model.Playlist;

public class Main {
	
	public static void main(String[] args) {
		
		Playlist playlist1 = new Playlist("R&B", 7, 10);
		playlist1.addBrano(new Brano("Bruno Mars", "24K Magic", "R&B", 3.47));
		playlist1.addBrano(new Brano("Rihanna", "Love on the brain", "R&B", 3.44));
		playlist1.addBrano(new Brano("Beyoncè", "Crazy in love", "R&B", 3.57));
		playlist1.addBrano(new Brano("The Weeknd", "Reminder", "R&B", 3.51));
		playlist1.addBrano(new Brano("Rihanna", "Loveeeeeee", "R&B", 4.17));
		playlist1.addBrano(new Brano("Drake", "Girls need love", "R&B", 3.42));
		playlist1.addBrano(new Brano("The Weeknd", "Is there someone else?", "R&B", 4.15));
		playlist1.addBrano(new Brano("Bruno Mars", "24K Magic", "R&B", 3.40));
		playlist1.addBrano(new Brano("Bruno Mars", "24K Magic", "R&B", 3.40));
		playlist1.addBrano(new Brano("Bruno Mars", "24K Magic", "R&B", 3.40));
		
		//Se inserisco lo stesso brano comparable Try{}catch
	}

}
