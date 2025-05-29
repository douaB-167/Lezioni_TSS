# Incapsulamento in Java
Uno dei quattro pilastri fondamentali della programmazione orientata agli oggetti (OOP), insieme a ereditarietà, polimorfismo e astrazione.

## Cos'è
L'incapsulamento è il principio di raggruppare i dati (variabili/attributi) e i metodi (funzioni/comportamenti), che operano su quei dati, all'interno di una singola classe. Allo stesso tempo, l'incapsulamento implica la restrizione dell'accesso diretto ai comportamenti interni (dati) di un oggetto.
In pratica, l'incapsulamento significa:
 * **Bunding (Raggruppamento)**: Tenere insieme dati e codice che agiscono su quei dati. Una classe è l'unità di incapsulamento.
 * **Information Hiding (Nascondere le informazioni)**: Rendere i dati (variabili di istanza) di una classe **privati** e fornire i metodi pubblici (**getter e setter**) per accedere e modificare quei dati in modo controllato.

## Come si realizza l'incapsulamento in Java?
In Java, l'incapsulamento è principalmente realizzato utilizzando i modificatori di accesso e fornendo metodi getter e setter.

#### esempio
```java
public class Persona{

    //caratteristiche dichiarate private
    private String nome;
    private String cognome;

    //costruttore a firma piena
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    //metodi getter e setter utilizzati poi nel main oppure da altre classi per accedere al dato
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = cognome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }
}
```