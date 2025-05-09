package giochini;

public class Multipli {
	public static void Multipli() {
		for (int i = 1; i <= 100; i++) {
			//System.out.println(i);
			if(i%15 == 0){
				System.out.println(i + " BANGARANG");
			}
			if(i%3 == 0) {
				System.out.println(i + " BOOM");
			}else if(i%5 == 0) {
				System.out.println(i + " ZOOM");
			}else {
				System.out.println(i);
			}
		}
	}

}
