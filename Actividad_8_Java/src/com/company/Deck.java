package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.util.HashSet;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    private HashSet<Card> fueraDeDeck = new HashSet<>();

    public Deck() {
        List<String> palos = Card.getPaloValido();

        List<String> valores = Card.getValorValido();

        for (String palo: palos) {
            for (String valor: valores) {
                deck.add(new Card(palo, valor));
            }
        }
    }

    public void muestraDeck() {
        for (int i=0; i<deck.size(); i++) {
            System.out.println(deck.get(i));
        }
    }

    public void muestraFueraDeDeck() {
        System.out.println("Las cartas fuera del deck son: "+fueraDeDeck);
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public void head() {
        System.out.println(deck.get(0));
        fueraDeDeck.add(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan "+deck.size()+" cartas en el deck");
    }

    public void pick() {
        Random random = new Random();
        int numeroRandom = random.nextInt(deck.size());
        System.out.println(deck.get(numeroRandom));
        fueraDeDeck.add(deck.get(numeroRandom));
        deck.remove(numeroRandom);
        System.out.println("Quedan "+deck.size()+" cartas en el deck");
    }

    public void hand() {
        for (int i = 0; i<5; i++) {
            System.out.println(deck.get(0));
            fueraDeDeck.add(deck.get(0));
            deck.remove(0);
        }
        System.out.println("Quedan "+deck.size()+" cartas en el deck");
    }
}
