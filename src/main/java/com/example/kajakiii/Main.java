package com.example.kajakiii;

import com.example.kajakiii.models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kajak kajak1 = new JednoosobowyKajak();
        Kajak kajak2 = new DwuosobowyKajak();


        RezerwacjaKajaka rezerwacja = new RezerwacjaKajaka();


        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nWybierz operację:");
            System.out.println("1. Zarezerwuj kajak");
            System.out.println("2. Wypożycz kajak");
            System.out.println("3. Zwróć kajak");
            System.out.println("4. Wyjście");
            System.out.print("Wybór: ");

            int wybor = scanner.nextInt();

            if (wybor == 1) {

                System.out.println("\nWybierz kajak do rezerwacji:");
                System.out.println("1. Jednoosobowy");
                System.out.println("2. Dwuosobowy");
                System.out.print("Wybór: ");
                int typKajaka = scanner.nextInt();

                if (typKajaka == 1) {
                    rezerwacja.zarezerwujKajak(kajak1);
                } else if (typKajaka == 2) {
                    rezerwacja.zarezerwujKajak(kajak2);
                } else {
                    System.out.println("Nieprawidłowy wybór.");
                }
            } else if (wybor == 2) {

                System.out.println("\nWybierz kajak do wypożyczenia:");
                System.out.println("1. Jednoosobowy");
                System.out.println("2. Dwuosobowy");
                System.out.print("Wybór: ");
                int typKajaka = scanner.nextInt();

                if (typKajaka == 1) {
                    rezerwacja.wypożyczKajak(kajak1);
                } else if (typKajaka == 2) {
                    rezerwacja.wypożyczKajak(kajak2);
                } else {
                    System.out.println("Nieprawidłowy wybór.");
                }
            } else if (wybor == 3) {

                System.out.println("\nWybierz kajak do zwrócenia:");
                System.out.println("1. Jednoosobowy");
                System.out.println("2. Dwuosobowy");
                System.out.print("Wybór: ");
                int typKajaka = scanner.nextInt();

                if (typKajaka == 1) {
                    rezerwacja.zwróćKajak(kajak1);
                } else if (typKajaka == 2) {
                    rezerwacja.zwróćKajak(kajak2);
                } else {
                    System.out.println("Nieprawidłowy wybór.");
                }
            } else if (wybor == 4) {

                System.out.println("Zakończenie programu.");
                break;
            } else {
                System.out.println("Nieprawidłowy wybór.");
            }
        }


        scanner.close();
    }
}
