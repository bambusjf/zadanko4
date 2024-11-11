package com.example.myapplication;

import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class klasy {
    private TextView wynik1;
    private TextView wynik2;
    private TextView wynik3;
    private TextView wynik4;
    private TextView wynik5;
    private TextView los;
    private TextView wynikgryp;
    private TextView rzuty;
    private Button start;
    private Button reset;
    private int jed;
    private int dwa;
    private int trz;
    private int czt;
    private int pie;
    private int sze;
    private int wynikgry;
    private int ilosc;
    private int wyniklos;

    public klasy(TextView wynik1, TextView wynik2, TextView wynik3, TextView wynik4, TextView wynik5, TextView los, TextView wynikgryp, TextView rzuty, Button start, Button reset) {
        this.wynik1 = wynik1;
        this.wynik2 = wynik2;
        this.wynik3 = wynik3;
        this.wynik4 = wynik4;
        this.wynik5 = wynik5;
        this.los = los;
        this.wynikgryp = wynikgryp;
        this.rzuty = rzuty;
        this.start = start;
        this.reset = reset;
    }


    public void rollDice() {
        Random rand = new Random();
        int liczba1 = rand.nextInt(6) + 1;
        int liczba2 = rand.nextInt(6) + 1;
        int liczba3 = rand.nextInt(6) + 1;
        int liczba4 = rand.nextInt(6) + 1;
        int liczba5 = rand.nextInt(6) + 1;
        wynik1.setText(String.valueOf(liczba1));
        wynik2.setText(String.valueOf(liczba2));
        wynik3.setText(String.valueOf(liczba3));
        wynik4.setText(String.valueOf(liczba4));
        wynik5.setText(String.valueOf(liczba5));
        wyniklos = 0;
        jed = dwa = trz = czt = pie = sze = 0;

        switch (liczba1) {
            case 1:
                jed += 1;
                break;
            case 2:
                dwa += 1;
                break;
            case 3:
                trz += 1;
                break;
            case 4:
                czt += 1;
                break;
            case 5:
                pie += 1;
                break;
            case 6:
                sze += 1;
                break;
        }

        switch (liczba2) {
            case 1:
                jed += 1;
                break;
            case 2:
                dwa += 1;
                break;
            case 3:
                trz += 1;
                break;
            case 4:
                czt += 1;
                break;
            case 5:
                pie += 1;
                break;
            case 6:
                sze += 1;
                break;
        }
        switch (liczba3) {
            case 1:
                jed += 1;
                break;
            case 2:
                dwa += 1;
                break;
            case 3:
                trz += 1;
                break;
            case 4:
                czt += 1;
                break;
            case 5:
                pie += 1;
                break;
            case 6:
                sze += 1;
                break;
        }
        switch (liczba4) {
            case 1:
                jed += 1;
                break;
            case 2:
                dwa += 1;
                break;
            case 3:
                trz += 1;
                break;
            case 4:
                czt += 1;
                break;
            case 5:
                pie += 1;
                break;
            case 6:
                sze += 1;
                break;
        }
        switch (liczba5) {
            case 1:
                jed += 1;
                break;
            case 2:
                dwa += 1;
                break;
            case 3:
                trz += 1;
                break;
            case 4:
                czt += 1;
                break;
            case 5:
                pie += 1;
                break;
            case 6:
                sze += 1;
                break;
        }
        switch (jed) {
            case 1:
                break;
            case 2:
                wyniklos += jed;
                break;
            case 3:
                wyniklos += jed;
                break;
            case 4:
                wyniklos += jed;
                break;
            case 5:
                wyniklos += jed;
                break;
            case 6:
                wyniklos += jed;
                break;
        }
        switch (dwa) {
            case 1:
                break;
            case 2:
                wyniklos += dwa * 2;
                break;
            case 3:
                wyniklos += dwa * 2;
                break;
            case 4:
                wyniklos += dwa * 2;
                break;
            case 5:
                wyniklos += dwa * 2;
                break;
            case 6:
                wyniklos += dwa * 2;
                break;
        }
        switch (trz) {
            case 1:
                break;
            case 2:
                wyniklos += trz * 3;
                break;
            case 3:
                wyniklos += trz * 3;
                break;
            case 4:
                wyniklos += trz * 3;
                break;
            case 5:
                wyniklos += trz * 3;
                break;
            case 6:
                wyniklos += trz * 3;
                break;
        }
        switch (trz) {
            case 1:
                break;
            case 2:
                wyniklos += trz * 3;
                break;
            case 3:
                wyniklos += trz * 3;
                break;
            case 4:
                wyniklos += trz * 3;
                break;
            case 5:
                wyniklos += trz * 3;
                break;
            case 6:
                wyniklos += trz * 3;
                break;
        }
        switch (czt) {
            case 1:
                break;
            case 2:
                wyniklos += czt * 4;
                break;
            case 3:
                wyniklos += czt * 4;
                break;
            case 4:
                wyniklos += czt * 4;
                break;
            case 5:
                wyniklos += czt * 4;
                break;
            case 6:
                wyniklos += czt * 4;
                break;
        }
        switch (pie) {
            case 1:
                break;
            case 2:
                wyniklos += pie * 5;
                break;
            case 3:
                wyniklos += pie * 5;
                break;
            case 4:
                wyniklos += pie * 5;
                break;
            case 5:
                wyniklos += pie * 5;
                break;
            case 6:
                wyniklos += pie * 5;
                break;
        }
        switch (sze) {
            case 1:
                break;
            case 2:
                wyniklos += sze * 6;
                break;
            case 3:
                wyniklos += sze * 6;
                break;
            case 4:
                wyniklos += sze * 6;
                break;
            case 5:
                wyniklos += sze * 6;
                break;
            case 6:
                wyniklos += sze * 6;
                break;
        }

        los.setText("Wynik tego losowania : " + wyniklos);
        wynikgry += wyniklos;
        updatescore(0);
        updateRollCount();
    }
    public void resetgame(){
        wynik1.setText(R.string.znak);
        wynik2.setText(R.string.znak);
        wynik3.setText(R.string.znak);
        wynik4.setText(R.string.znak);
        wynik5.setText(R.string.znak);
        wyniklos=wynikgry=ilosc=0;
        los.setText("Wynik tego losowania : " + wyniklos);
        wynikgry += wyniklos;
        wynikgryp.setText("Wynik gry: " + wynikgry);
        rzuty.setText("Liczba rzutów: " + ilosc);
    }
    public void updatescore(int newScore){
        wynikgry+=newScore;
        wynikgryp.setText("Wynik gry: " + wynikgry);
    }
    public void updateRollCount(){
        ilosc += 1;
        rzuty.setText("Liczba rzutów: " + ilosc);
    }
}
