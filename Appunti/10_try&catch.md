# Eccezioni in Java
Le **eccezioni** in Java rappresentano eventi anomali o condizioni di errore che interrompono il normale flusso di esecuzione di un programma. Forniscono un meccanismo strutturato per gestire queste situazioni impreviste, rendendo il codice più robusto e manutenibile.  
Se si aggiunge anche l'operatore ```finally``` dopo il catch, il corpo definito all'interno del finally verrà sempre eseguito indipendentemente dal codice precedente.

## Tipi di eccezioni 
1. Eccezioni Controllare (Checked Exceptions):
    * Devono essere **gestite esplicitamente** nel codice (tramite ```try-catch```) o dichiarate nella firma del metodo (con ```throws```);
    * Il compilatore verifica che vengano gestite;
    * esempio comune: ```IOExeption```.
1. Eccezioni Non Controllate (Unchecked Exceptions / Runtime Exception):
    * Non è obbligatorio geestirle esplicitamente, ma è spesso consigliabile;
    * Solitamente derivano da errori di programmazione o condizioni anomale a runtime;
    * esempi comuni: ```NullPointerException, ArrayIndexOutOfBoundsException```.

# Blocchi Try-Catch
Il costrutto ```try-catch``` permette di gestire le eccezioni:
```java 
try {
    // Codice che potrebbe lanciare un'eccezione
} catch (TipoEccezione e) {
    // Blocco per gestire l'eccezione di tipo TipoEccezione
    // 'e' è un riferimento all'oggetto eccezione
}
```
