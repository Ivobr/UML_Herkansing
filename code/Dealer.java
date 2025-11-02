package code;

import java.util.ArrayList;

public class Dealer {
    ArrayList<BenzineAuto> BenzineAutos = new ArrayList<BenzineAuto>();
    ArrayList<ElektrischeAuto> ElektrischeAutos = new ArrayList<>();
    AutoMerk bmw;
    AutoMerk audi;
    AutoMerk ford;
    Bank mijnBank;

    //rekening

    public Dealer(){
        Bank mijnBank = new Bank();
    }

    public void SetMerken(AutoMerk bmws, AutoMerk audis, AutoMerk fords){

        bmw = bmws;
        ford = fords;
        audi = audis;
    }
    public void WhatForSale(){
        System.out.println("Kleur, soort, merk: " + BenzineAutos);
        System.out.println("Kleur, soort, merk: " + ElektrischeAutos);
    }

    public void makeBenzineCar(int belastinSchaal, AutoMerk autoMerk, Color kleur){

        String merk = autoMerk.getMerk();
        switch(merk){
            case "Audi":
                BenzineAuto newAudi = audi.UitstootMaken(belastinSchaal, kleur, autoMerk);
                BenzineAutos.add(newAudi);
                break;
            case "Ford":
                BenzineAuto newFord = ford.UitstootMaken(belastinSchaal, kleur, autoMerk);
                BenzineAutos.add(newFord);
                break;
            case "BMW":
                BenzineAuto newBMW = bmw.UitstootMaken(belastinSchaal, kleur, autoMerk);
                BenzineAutos.add(newBMW);
                break;
        }

        BenzineAuto BenzineAutoB = BenzineAutos.get(0);
        BenzineAutoB.informatie();
    }

    public void makeElektrischeAuto(int belastinSchaal, AutoMerk autoMerk, Color kleur){
        String merk = autoMerk.getMerk();

        switch(merk){
            case "Audi":
                ElektrischeAuto newAudi = audi.ZuinigMaken(belastinSchaal, kleur, autoMerk);
                ElektrischeAutos.add(newAudi);
                break;
            case "Ford":
                ElektrischeAuto newFord = ford.ZuinigMaken(belastinSchaal, kleur, autoMerk);
                ElektrischeAutos.add(newFord);
                break;
            case "BMW":
                ElektrischeAuto newBMW = bmw.ZuinigMaken(belastinSchaal, kleur, autoMerk);
                ElektrischeAutos.add(newBMW);
                break;
        }
        ElektrischeAuto elek = ElektrischeAutos.getFirst();
        elek.informatie();
    }

    public ElektrischeAuto getFirstE(){
        if(!ElektrischeAutos.isEmpty()){
            ElektrischeAuto Verkoop =  ElektrischeAutos.getFirst();
            ElektrischeAutos.removeFirst();
            return Verkoop;
        }
        return null;
    }
    public BenzineAuto getFirstB(){
        if(!BenzineAutos.isEmpty()){
            BenzineAuto verkoop = BenzineAutos.getFirst();
            BenzineAutos.removeFirst();
            return verkoop;
        }
        return null;
    }

    public Double omrekenen(double oudePrijs){
        double nieuwePrijs = mijnBank.ToEuro(oudePrijs);
        return nieuwePrijs;
    }
}
