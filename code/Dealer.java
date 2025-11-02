package code;

import java.util.ArrayList;

public class Dealer {
    private ArrayList<BenzineAuto> BenzineAutos = new ArrayList<BenzineAuto>();
    private ArrayList<ElektrischeAuto> ElektrischeAutos = new ArrayList<>();
    private AutoMerk bmw;
    private AutoMerk audi;
    private AutoMerk ford;
    private Onderhandeling Gonderhandel;
    private Onderhandeling Donderhandel;

    public Dealer(Onderhandeling Donderhandel, Onderhandeling Gonderhandel) {
        this.Donderhandel = Donderhandel;
        this.Gonderhandel = Gonderhandel;
    }

    public void SetMerken(AutoMerk bmws, AutoMerk audis, AutoMerk fords) {

        bmw = bmws;
        ford = fords;
        audi = audis;
    }

    public void WhatForSale() {
        System.out.println("Kleur, soort, merk: " + BenzineAutos);
        System.out.println("Kleur, soort, merk: " + ElektrischeAutos);
    }

    public void makeBenzineCar(float budget, AutoMerk autoMerk, Color kleur) {

        String merk = autoMerk.getMerk();
        switch (merk) {
            case "Audi":
                BenzineAuto newAudi = audi.UitstootMaken(budget, kleur, autoMerk);
                BenzineAutos.add(newAudi);
                break;
            case "Ford":
                BenzineAuto newFord = ford.UitstootMaken(budget, kleur, autoMerk);
                BenzineAutos.add(newFord);
                break;
            case "BMW":
                BenzineAuto newBMW = bmw.UitstootMaken(budget, kleur, autoMerk);
                BenzineAutos.add(newBMW);
                break;
        }

        BenzineAuto BenzineAutoB = BenzineAutos.get(0);
        BenzineAutoB.informatie();
    }

    public void makeElektrischeAuto(float budget, AutoMerk autoMerk, Color kleur) {
        String merk = autoMerk.getMerk();

        switch (merk) {
            case "Audi":
                ElektrischeAuto newAudi = audi.ZuinigMaken(budget, kleur, autoMerk);
                ElektrischeAutos.add(newAudi);
                break;
            case "Ford":
                ElektrischeAuto newFord = ford.ZuinigMaken(budget, kleur, autoMerk);
                ElektrischeAutos.add(newFord);
                break;
            case "BMW":
                ElektrischeAuto newBMW = bmw.ZuinigMaken(budget, kleur, autoMerk);
                ElektrischeAutos.add(newBMW);
                break;
        }
        ElektrischeAuto elek = ElektrischeAutos.getFirst();
        elek.informatie();
    }


    // Transfer car van dealer naar klant
    public void transferElektrischeAuto(Klant klant) {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Transfer Elektrische Auto");
        if (!ElektrischeAutos.isEmpty()) {
            ElektrischeAuto verkoop = getFirstE();
            int prijs = verkoop.getprijs();
            int onderhandeldeprijs = 0;
            System.out.println("auto info:");
            verkoop.informatie();

            if (klant.getBudget() < (prijs * 2)) { // Klant heeft ruim voldoende budget, dus meer vragen
                onderhandeldeprijs = Donderhandel.onderhandelPrijs(prijs, klant);
            } else {
                onderhandeldeprijs = Gonderhandel.onderhandelPrijs(prijs, klant);
            }

            if (onderhandeldeprijs != 0) {
                System.out.println("Prijs is onderhandeld met de klant, auto wordt overgedragen");
                klant.buyCar(verkoop);
                ElektrischeAutos.remove(0);
            }

        } else {
            System.out.println("opperdepop");
        }

    }

    // transfer car van dealer naar klant
    public void transferBenzineAuto(Klant klant) {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Transfer Benzine Auto");
        if (!BenzineAutos.isEmpty()) {
            BenzineAuto verkoop = getFirstB();
            int prijs = verkoop.getprijs();
            int onderhandeldeprijs = 0;
            System.out.println("auto info:");
            verkoop.informatie();

            if (klant.getBudget() < (prijs * 2)) { // Klant heeft ruim voldoende budget, dus meer vragen
                onderhandeldeprijs = Donderhandel.onderhandelPrijs(prijs, klant);
            } else {
                onderhandeldeprijs = Gonderhandel.onderhandelPrijs(prijs, klant);
            }

            if (onderhandeldeprijs != 0) {
                System.out.println("Prijs is onderhandeld met de klant, auto wordt overgedragen");
                klant.buyCar(verkoop);
                BenzineAutos.remove(0);
            }
        } else {
            System.out.println("opperdepop");
        }
    }

    public ElektrischeAuto getFirstE() {
        if (!ElektrischeAutos.isEmpty()) {
            ElektrischeAuto Verkoop = ElektrischeAutos.getFirst();
            // ElektrischeAutos.removeFirst();
            return Verkoop;
        }
        return null;
    }

    public BenzineAuto getFirstB() {
        if (!BenzineAutos.isEmpty()) {
            BenzineAuto verkoop = BenzineAutos.getFirst();
            // BenzineAutos.removeFirst();
            return verkoop;
        }
        return null;
    }
}
