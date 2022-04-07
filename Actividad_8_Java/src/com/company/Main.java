package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Deck miDeck = new Deck();
        Scanner scanner = new Scanner(System.in);
        showMenu(miDeck, scanner);
    }

    public static void showMenu(Deck miDeck, Scanner scanner) throws Exception {
        boolean repetir = true;
        char opcion = '0';
        System.out.println("Bienvenido a Poker!");

        do {
            System.out.println("Selecciona una opción:\n1 Mezclar Deck\n2 Sacar una carta\n" +
                    "3 Carta al azar\n4 Genera una mano de 5 cartas\n0 Salir");
            try {
                opcion = scanner.next().charAt(0);
                if (opcion != '0' && opcion != '1' && opcion != '2' && opcion != '3' && opcion != '4') {
                    throw new InvalidOptionException();
                }
            } catch (InvalidOptionException e) {
                System.out.println(e.getMessage());
            }
            try {
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
                }
            } catch (NoHandAvailableException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }

        } while (repetir);

    }
}
