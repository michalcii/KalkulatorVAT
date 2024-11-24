package com.example.kajakiii.models;

public class Kajak {
    protected String stan;

    public Kajak() {
        this.stan = "dostępny"; // Na początku kajak jest dostępny
    }

    public void zarezerwuj() {
        if (stan.equals("dostępny")) {
            stan = "zarezerwowany";
            System.out.println("Kajak został zarezerwowany.");
        } else {
            System.out.println("Kajak nie jest dostępny do rezerwacji.");
        }
    }

    public void wypożycz() {
        if (stan.equals("zarezerwowany")) {
            stan = "wypożyczony";
            System.out.println("Kajak został wypożyczony.");
        } else if (stan.equals("dostępny")) {
            System.out.println("Kajak jest już dostępny do wypożyczenia.");
        } else {
            System.out.println("Kajak jest już wypożyczony.");
        }
    }

    public void zwróć() {
        if (stan.equals("wypożyczony")) {
            stan = "dostępny";
            System.out.println("Kajak został zwrócony i jest dostępny.");
        } else {
            System.out.println("Kajak nie jest wypożyczony.");
        }
    }

    public String getStan() {
        return stan;
    }
}
