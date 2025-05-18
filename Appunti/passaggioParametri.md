# Passaggio per valore (Pass by value)
* **cosa succede**: quando passi un variabile come argomento a un metodo, viene creata una copia del valore di quella variabile. Qualsiasi modifica apportata alla copia all'interno del metodo non influisce sulla variabile originale.
* **tipi di dati**: questo comportamento si applica ai tipi di dati primitivi in Java.
    ## esempio di passaggio per valore 
    ```java
    public class PassaggioValore {

        public static void modificaValore(int x) {
            x = 20; // Modifica la copia locale di x
            System.out.println("Dentro il metodo: x = " + x);
        }

        public static void main(String[] args) {
            int numero = 10;
            modificaValore(numero);
            System.out.println("Fuori dal metodo: numero = " + numero);
        }
    }
    ```
    ## output
    ```
    Dentro il metodo: x = 20
    Fuori dal metodo: numero = 10
    ```
* **spiegazione**: la variabile numero mantiene il suo valore originale di 10 perchè il metodo modificaValore opera su una **copia** del suo valore.

# Passaggio per riferimento (Pass by reference)
* **cosa succede**: tecnicamente, Java passa sempre i valori, pure per gli oggetti. Quando passi un oggetto come argomento a un metodo, viene passata una copia del riferimento all'oggetto. Questo significa che sia la variabile originale che la copia del riferimento **puntano alla stessa area di memoria**. Di conseguenza, le modifiche apportate all'oggetto tramite il riferimento nel metodo influenzano l'oggetto originale.
* **tipi di dati**: questo comportamento si applica agli oggetti in Java (istanze di classi).
    ## esempio di passaggio del riferimento dell'oggetto
    ```java
    public class PassaggioRiferimento {

        static class Persona {
            String nome;
        }

        public static void modificaNome(Persona persona) {
            persona.nome = "Bob"; // Modifica l'oggetto originale
            System.out.println("Dentro il metodo: nome = " + persona.nome);
        }

        public static void main(String[] args) {
            Persona persona = new Persona();
            persona.nome = "Alice";
            modificaNome(persona);
            System.out.println("Fuori dal metodo: nome = " + persona.nome);
        }
    }
    ```
    ## output 
    ```
    Dentro il metodo: nome = Bob
    Fuori dal metodo: nome = Bob
    ```
* **spiegazione**: il metodo modificaNome modifica l'attributo nome dell'oggetto persona originale perchè opera tramite il riferimento all'oggetto.

## In sintesi
* Java utilizza sempre il passaggio per valore;
* con i tipi primitivi, viene passata una copia del valore;
* con gli oggetti, viene passata una copia del riferimento all'oggetto.