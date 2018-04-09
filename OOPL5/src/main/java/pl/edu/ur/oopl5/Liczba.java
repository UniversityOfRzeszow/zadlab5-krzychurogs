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
public class Liczba {
    Scanner odczyt=new Scanner(System.in);
    String liczba;

    public Liczba(String liczba) {
        this.liczba = liczba;
    }

   public void wypiszLiczbe() {
        System.out.println(liczba);
    }

   public void pomnozLiczbe() {
        int x,y,wynik;

        System.out.println("Podaj liczbe: ");
        x= odczyt.nextInt();
        y = Integer.parseInt(liczba);
        wynik = x * y;
        this.liczba = String.valueOf(wynik);

    }
    public void silnia (int n){
        
        int wynik=1;
        for(int i=0;i<n;i++)
        {
            wynik*=i;
        }
       this.liczba=String.valueOf(wynik);
    }
        
    
    
    }


