/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author krzysztof
 */
public class Firma {
   Pracownik[] pracownicy = new Pracownik[100];

    void dodajPracownika() {
        Scanner odczyt=new Scanner(System.in);
        String imie, nazwisko, stanowisko;
        int wiek, i;
        System.out.println("Ktory na liscie ma byc pracownik?");
        i= odczyt.nextInt();
        System.out.println("podaj imie,nazwisko,wiek,stanowisko");
        
        pracownicy[i-1] = new Pracownik(odczyt.next(),odczyt.next(),odczyt.nextInt(),odczyt.next());
        
    }

    void wypiszPracownikow() {
        for (int i = 0; i < 100; i++) {
            if(pracownicy[i]!=null)
            pracownicy[i].infoprac();
            }
    }
}


