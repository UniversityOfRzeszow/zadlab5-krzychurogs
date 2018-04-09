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
public class Stos {
  
    Scanner odczyt=new Scanner(System.in);
    /*  int n;
    private int wsk=0;
    private int tab[]=new int[n];
    

    public Stos(int n) {
        this.n = n;
        
     }
    public void dodaj()
    {
        for(int i=0;i<n;i++)
        {
            tab[i]=odczyt.nextInt();
        }
    }
    public void inf()
    {
     for(int i=0;i<n;i++)   
     {
         System.out.println(tab[i]);
         
         
         }
    }
*/
    private int wskaznik_stosu=0;
    int rozmiar;
    private int tab[] ;
    public Stos(int rozmiar) {
        this.rozmiar = rozmiar;
        this.tab=new int[rozmiar];
        
    }
    
    void push() {
        if (wskaznik_stosu >= rozmiar) {
            System.out.println("Stos jest pelny");
        } else {

            System.out.println("podaj liczbe na stos");
             
            tab[wskaznik_stosu]=odczyt.nextInt();
            wskaznik_stosu++;
            
                    
        }

    }

    void pop() {
        if (wskaznik_stosu>=1) {
           System.out.println("usuwamy ze stosu");
           
           wskaznik_stosu--;
        } else {    

            System.out.println("stos pusty");

        }
        

    }
        void wyswietlstos(){
           System.out.println("STOS: ");
           for (int i=wskaznik_stosu;i>=0;i--)
           {
               System.out.println(tab[i]);
           }
       }

    


    
}