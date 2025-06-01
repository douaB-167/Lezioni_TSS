### Input dall'utente
```java
import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual è il tuo nome? ");
    String nome = scanner.nextLine();
    
    System.out.println("Qual è il tuo cognome? ");
    String cognome = scanner.nextLine();

    System.out.println("Qual è la tua età? ");
    int eta = scanner.nextInt(); //legge solo il numero, ma lascia il \n (invio) premuto dopo il numero nel buffer
    scanner.nextLine(); //serve per pulire il buffer prima di leggere la prossima stringa

    System.out.println("In che città vivi? ");
    String citta = scanner.nextLine(); //legge quell’invio rimasto, non la città, e ti restituisce una stringa vuota

    //canner.nextBoolean();
    //scanner.nextDouble();

    System.out.println("Ciao " + nome + cognome);
    System.out.println("Hai " + eta + " anni");
    System.out.println("Vivi a " + citta);
}
```