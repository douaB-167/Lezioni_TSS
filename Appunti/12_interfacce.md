# Interfacce 
## Definizione
Un'interfaccia in Java è un **contratto** che definisce un insieme di metodi che una classe deve **implementare**. E' simile a una classe astratta, ma può contenere SOLO **metodi astratti e costanti**.  
Un contratto con metodi senza implementazione.

## Caratteristiche principali
### Sintassi base
```java
public interface NomeInterfaccia {
    // Dichiarazione di metodi ( public e abstract implicito)
    void metodo1();
    int metodo2(String parametro);
    
    // Costanti (implicitamente public, static e final)
    int COSTANTE = 100;
}
```
### Proprietà delle interfacce 
 * **Metodi astratti**: Tutti i metodi sono implicitamente ```public``` e ```abstract```;
 * **Costanti**: Tutte le variabili sono implicitamente ```public```, ```static``` e ```final```;
 * **Ereditarietà multipla**: Una classe può implementare più interfacce;
 * **Estensione**: Un'interfaccia può estendere altre interfacce.

## Implementazione 
Una ckasse implementa un'interfaccia usando la parola chiave ```implements```:
```java
public class MiaClasse implements NomeInterfaccia {
    @Override
    public void metodo1() {
        // Implementazione obbligatoria
    }
    
    @Override
    public int metodo2(String parametro) {
        // Implementazione obbligatoria
        return 0;
    }
}
```
## Novità Java 8+
### Metodi default 
Permettono di aggiungere implementazioni concrete nelle interfacce:
```java
public interface MiaInterfaccia {
    default void metodoDefault() {
        System.out.println("Implementazione di default");
    }
}
```

### Metodi static 
Metodi statici che appartengono all'interfaccia:
```java
public interface MiaInterfaccia {
    static void metodoStatico() {
        System.out.println("Metodo statico dell'interfaccia");
    }
}
```

## Vantaggi delle interfacce
1. **Polimorfismo**: Permettono di trattare oggetti diversi in modo uniforme;
1. **Flessibilità**: Una classe può implementare più interfacce;
1. **Disaccoppiamento**: Separano l'interfaccia dall'implementazione;
1. **Contratto**: Garantiscono che le classi implementino determinati metodi

### Differenza tra classi astratte e interfacce 
| Classi astratte | Interfacce |
|-----------------|------------|
| Possono avere metodi concreti e astratti | Tradizionalmente solo metodi astratti (prima di Java 8) |
| Supportano modificatori di accesso | Tutti i metodi sono implicitamente public |
| Una classe può estendere solo una classe astratta | Una classe può implementare più interfacce |
| Possono avere costruttori | Non possono avere costruttori |
| Possono avere campi di istanza (proprietà) | Solo costanti (public static final) |
| Possono avere metodi statici | Prima di Java 8 non potevano avere metodi statici |