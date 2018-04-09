package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6

        //    Firma robotnik=new Firma();
        //  robotnik.firmaprac();
        //   robotnik.pokazPracownikow();
        Scanner odczyt = new Scanner(System.in);
        int zadanie;
        System.out.println("wybor zadania");
        zadanie = odczyt.nextInt();
        switch (zadanie) {
            case 1:
            {

                System.out.println("podaj rozmiar stosu");
                Stos tr = new Stos(odczyt.nextInt());

                int wybor = 1;
                while (wybor != 0) {
                    System.out.println("wybierz co robimy z tym stosem(1.dodanie,2-usuniecie,3-wyswietlenie");
                    wybor = odczyt.nextInt();

                    switch (wybor) {
                        case 1: {
                            tr.push();
                            break;
                        }
                        case 2: {
                            tr.pop();
                            break;

                        }

                        case 3: {
                            tr.wyswietlstos();
                        }

                    }

                }
                break;
            }   
            case 2:
            {
                Firma firemka=new Firma();
             

                int n=1;
                while(n!=0)
                {
                System.out.println("1.dodajemy,2.wyswietlamy");
                n=odczyt.nextInt();
                    switch(n)
                {
                    case 1:
                    {
                     firemka.dodajPracownika();
                     break;
                    
                    }
                    case 2:
                    {
                           firemka.wypiszPracownikow();
                           break;
                    }
                }
                    
                }
        }
            case 3:
            {
                System.out.println("podaj liczbe(str)");
                String liczba=odczyt.next();
                Liczba obliczba=new Liczba(liczba);
                int wybor2=1;
                while(wybor2!=0)
                {
                    System.out.println("1.mnozenie,2.silnia,3.wypisywanie");
                wybor2=odczyt.nextInt();
                switch(wybor2)
                {
                    case 1:
                    {
                        obliczba.pomnozLiczbe();
                        break;                    }
                    case 2:
                    {
                        System.out.println("podaj liczbe");
                         int n = odczyt.nextInt();
                        obliczba.silnia(n);
                        break;
                    }
                    case 3:
                    {
                        
                        obliczba.wypiszLiczbe();
                        break;
                    }
                }
                
                
                }
            }

    }

}
}
