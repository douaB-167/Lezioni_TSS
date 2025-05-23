# Che cos'è java
Java è un linguaggio di alto livello e orientato agli oggetti, creato dalla Sun Microsystem nel 1995.
Le caratteristiche dei linguaggi di programmazione Java sono:
* La tipoloia di linguaggio **orientato agli oggetti** (ereditarietà, polimorfismo, incapsulamento);
* La **gestione della memoria** effettuata automaticamente dal sistema, il quale si preoccupa dell'allocazione e della successiva deallocazione della memoria (il programmatore viene liberato dagli obblighi di gestione della memoria);
* La **portabilità** cioè la capacità di un programma di poter essere eseguito su piattaforme diverse senza dover essere e modificato e ricompilato.
1. Orientato agli oggetti: Java adotta appieno il paradigma della OOP, facilitando la creazione di codice modulare e riutilizzabile.

## Caratteristiche
1. Gestione automatica della memoria: Java offre una gestione della memoria completamnte automatica grazie al **garbage collector**, che libera memoria in modo efficiente senza intervento diretto da parte dello sviluppatore.
1. Portabilità e compatibilità: Il detto "Write once, run anywhere" è ancora una delle principali forze di Java. Grazie alla JVM (Java Virtual Machine), il codice Java può essere eseguito su qualsiasi piattaforma con una JVM installata.
1. Sicurezza e robustezza: la sicurezza rimane un pilastro di Java. Meccanismi come la **la verifica del bytecode**, le **policy di accesso alla rete** e il controllo rigoroso dei tipi continuano a rendere Java una scelta eccellente per le aplicazioni mission-critical.
1. Multi-threading e prestazioni migliorate: Java ha supportato il multi-threading, permettendo l'esecuzione simultanea di più thread per migliorare l'efficienza delle applicazioni.
1. Funzionalità dinamiche e moderna: Java ha introdotto sempre più caratteristiche dinamiche con il tempo, tra cui **lambdas** e **streams**, che rendono la programmazione funzionale parte integrante del linguaggio.

## Cosa ci serve
* JDK (Java Development Kit), strumenti di sviluppo per esecuzione, compilazione e debug di un'applicazione;
* IDE (Integrated Development Environment).

### Identificatori
L'identificatore è il nome che formiano ad un package, una classe, un metodo e una variabile.
Caratteri consentiti:
* Lettere alfabeto;
* Numeri (ATT: non possono cominciare con un numero);
* Underscore (_);
* Dollaro ($).
Le parole vietate per denominare un identificatore: tutte le keyword di Java, inclusi true e false.

## Convenzioni 
1. Convenzioni per **classi** 
    * iniziale Maiuscola;
1. Convenzioni per **metodi**
    * camelCase 
    * solitamente è un verbo
1. Convenzioni per **variabili**
    * camelCase

# Tipi in Java
## Tipi Primitivi
### Interi: 
1. Byte: 
    * Dimensione: 8 bit
    * Intervallo: -128 a 127
1. Short:
    * Dimensione 16 bit
    * Intervallo: -32,768 a 32,767
1. Int:
    * Dimensione: 32 bit
    * Intervallo: -2,147,483,648 a 2,147,483,647
1. Long:
    * Dimensione: 64 bit
    * Intervallo: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
### Virgola mobile:
1. Float: 
    * Dimensione: 32 bit
    * Precisione: Circa 7 cifre decimali
1. Double:
    * Dimensione: 64 bit
    * Precisione: Circa 15 cifre decimali
### Testuali:
1. Char:
    * Dimensione: 16 bit
    * Intervallo: 0 a 65,535 (rappresenta un singolo carattere Unicode)
### Logici:
1. Boolean: 
    * Dimensione: non specificata (generalmente 1 bit)
    * Può assumere solo i valori true o false

## Tipi per oggetti
### Array
### Object: 
1. String 