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
public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;
    String stanowisko;

    
   
    public void infoprac()
    {
        System.out.println("imie to "+this.imie);
        System.out.println("nazwisko to "+this.nazwisko);
        System.out.println("wiek to "+this.wiek);
        System.out.println("stanowisko "+this.stanowisko);
        
        
    }
    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    
    
}
