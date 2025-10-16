package code.Factory;

import java.util.ArrayList;

public class Dealer {
    public String type = "Opium";
    ArrayList<BenzineAuto> BenzineAutos = new ArrayList<>();
    ArrayList<ElektrischeAuto> ElektrischeAutos = new ArrayList<>();
    AutoMerk bmw;

    public Dealer(){
        System.out.println(type);
    }

    public void SetMerken(AutoMerk bmws, FabriekManager GManager, FabriekManager DManager){
        bmw = bmws;
        bmw.setManagers(GManager, DManager);
    }
    public void WhatForSale(){
        System.out.println("Kleur, soort, merk: " + BenzineAutos);
        System.out.println("Kleur, soort, merk: " + ElektrischeAutos);
    }

    public BenzineAuto makeBenzineCar(AutoMerk autoMerk, Color kleur){

        BenzineAuto newCar = bmw.UitstootMaken("Goedkoop", kleur);

        System.out.println("Holy fuck first try, ");
        autoMerk.print();
        return newCar;
    }
}
