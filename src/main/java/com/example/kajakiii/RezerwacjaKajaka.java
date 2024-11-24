package com.example.kajakiii.models;

public class RezerwacjaKajaka {
    public void zarezerwujKajak(Kajak kajak) {
        kajak.zarezerwuj();
    }

    public void wypożyczKajak(Kajak kajak) {
        kajak.wypożycz();
    }

    public void zwróćKajak(Kajak kajak) {
        kajak.zwróć();
    }
}
