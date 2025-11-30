Questo progetto simula una gara atletica in Java usando la programmazione concorrente. 
Ogni atleta corre su un thread separato e il giudice registra l’ordine di arrivo sul podio, sia su console che su file
STRUTTURA PROGETTO:
GaraAtletica.java
Classe principale che avvia la gara e crea gli atleti.

Atleta.java
Rappresenta un atleta. Implementa Runnable e aggiorna la distanza percorsa in maniera casuale fino a raggiungere i 100 metri.

Giudice.java
Tiene traccia degli atleti, gestisce il podio e determina la fine della gara.
Si occupa di sincronizzare l’accesso al podio.

GestoreFile.java
Gestisce la scrittura dei risultati della gara su file podio.

FUNZIONAMENTO:
Gli atleti vengono creati e registrati dal giudice.
La gara parte con un conto alla rovescia.
Ogni atleta si muove casualmente fino a completare la distanza di 50 metri.
Il giudice registra l’arrivo degli atleti e stampa il podio.
I risultati vengono salvati su podio.txt.

