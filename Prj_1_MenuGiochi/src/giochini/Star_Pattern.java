package giochini;

public class Star_Pattern {
	public static void Star_Pattern() {
		System.out.println("Esercizio 1:");
		for (int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println("Esercizio 2:");
		for (int i = 5; i  >= 1; i--) {
            // Inner loop for number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            // Move to the next line after printing stars in each row
            System.out.println();
        }
		System.out.println("Esercizio 3:");
		for (int i = 1; i <= 4; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for (int i = 3; i  >= 1; i--) {
            // Inner loop for number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            // Move to the next line after printing stars in each row
            System.out.println();
        }
		System.out.println("Esercizio 4: ");
		int n = 5;
		for (int i = 0; i  <  n; i++) {
            // Print leading spaces
            for (int j = n - 1; j  >  i; j--) {
                System.out.print(" ");
            }

            // Print the first and last rows
            if (i == 0 || i == n - 1) {
                for (int k = 0; k  <= i; k++) {
                    System.out.print("@ ");
                }
            } else {
                // Print the first asterisk
                System.out.print("@");

                // Print spaces inside the pyramid
                for (int k = 1; k  <  i; k++) {
                    System.out.print(" @");
                }

                // Print the second asterisk
                System.out.print(" @");
            }

            // Move to the next line
            System.out.println();
        }
		System.out.println("Esercizio 5:");
		int d = 5;
		for (int i = 0; i  <  d; i++) {
            // Print leading spaces
            for (int j = d - 1; j  >  i; j--) {
                System.out.print(" ");
            }

            // Print the first and last rows
            if (i == 0 || i == d - 1) {
                for (int k = 0; k  <= i; k++) {
                    System.out.print("@ ");
                }
            } else {
                // Print the first asterisk
                System.out.print("@");

                // Print spaces inside the pyramid
                for (int k = 1; k  <  i; k++) {
                    System.out.print("  ");
                }

                // Print the second asterisk
                System.out.print(" @");
            }

            // Move to the next line
            System.out.println();
        }
	}

}
