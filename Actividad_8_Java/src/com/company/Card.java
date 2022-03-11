package com.company;
import java.util.Arrays;
import java.util.List;

public class Card {
    private String Palo;
    private String Color;
    private String Valor;

    public Card(String Palo, String Valor) {
        setPaloYColor(Palo);
        setValor(Valor);
    }

    public void setPaloYColor (String Palo) {
        List<String> PaloValido = getPaloValido();
        Palo = Palo.toLowerCase();
        if (PaloValido.contains(Palo)) {
            this.Palo = Palo;
            if (Palo == "corazón" || Palo == "diamante") {
                this.Color = "rojo";
            } else this.Color = "negro";
        } else {
            throw new IllegalArgumentException("No es un palo valido");
        }
    }

    public static List<String> getPaloValido() {
        return Arrays.asList("trébol", "corazon", "pica", "diamante");
    }

    public void setValor (String Valor) {
        List<String> ValorValido = getValorValido();
        Valor = Valor.toUpperCase();
        if (ValorValido.contains(Valor)) {
            this.Valor = Valor;
        } else {
            throw new IllegalArgumentException("No es un valor valido");
        }
    }

    public static List<String> getValorValido() {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
    }


    public String getPalo() {
        return Palo;
    }

    public String getColor() {
        return Color;
    }

    public String getValor() {
        return Valor;
    }

    public String toString() {
        return String.format("%s, %s, %s", Palo, Color, Valor);
    }
}
