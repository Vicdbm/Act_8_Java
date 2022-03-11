package com.company;

public class Main {

    public static void main(String[] args) {
        Deck miDeck = new Deck();

        //se retira la primera carta
        miDeck.head();

        //se retiran las siguientes 5 cartas
        miDeck.hand();

        //se retira una carta al azar
        miDeck.pick();

        //muestra las cartas que han sido removidas
        miDeck.muestraFueraDeDeck();

        //revuelve las cartas
        miDeck.shuffle();

        //muestra las cartas restantes del deck
        miDeck.muestraDeck();
    }
}
