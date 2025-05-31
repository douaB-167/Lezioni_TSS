# String methods
Le stringhe sono **immutabili** dunuqe ogni metodo applicato restituirà una nuova stringa, non modificherà quella iniziale
* ```message.endsWith(substring)```: restituisce true/false;
* ```message.startsWith(substring)```: restituisce true/false;
* ```message.length()```: restituisce il numero di caratteri contenenti all'interno della stringa;
* ```message.indexOf(character)```: ritorna il primo indice del carattere che si sta cercando, se non c'è restituisce -1;
* ```message.replace(target, replacement)```: sostituisce un numero di carattere spercificato in un altro;
* ```message.toLowerCase()```: trasforma la stringa in carattere minuscoli;
* ```message.toUpperCase()```: trasforma la stringa in carattere maiuscoli;
* ```message.trim()```: rimuove gli spazi iniziali e finali della stringa;
* ```String.valueOf(variable)```: converte i seguenti tipi in Stringa: boolean, char, char[], double, float, int, long, Object;
* ```string.equals(string)```: controlla se le due stringhe hanno uguale contenuto, restituendo true/false;