package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Deck miDeck = new Deck();
        Scanner scanner = new Scanner(System.in);

        showMenu(miDeck, scanner);
    }

    public static void showMenu(Deck miDeck, Scanner scanner) {
        boolean repetir = true;
        char opcion = '0';
        System.out.println("Bienvenido a Poker!");

        do {
            System.out.println("Selecciona una opción:\n1 Mezclar Deck\n2 Sacar una carta\n" +
                    "3 Carta al azar\n4 Genera una mano de 5 cartas\n0 Salir");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case '1':
                    miDeck.shuffle();
                    break;
                case '2':
                    miDeck.head();
                    break;
                case '3':
                    miDeck.pick();
                    break;
                case '4':
                    miDeck.hand();
                    break;
                case '0':
                    repetir = false;
                    break;
                default:
                    System.out.println("Opción no valida");
            }

        } while (repetir);

    }
}
