package code.Factory;

import java.util.ArrayList;

public class Dealer {
    public String type = "Opium";
    ArrayList<BenzineAuto> BenzineAutos = new ArrayList<BenzineAuto>();
    ArrayList<ElektrischeAuto> ElektrischeAutos = new ArrayList<>();
    AutoMerk bmw;
    AutoMerk audi;
    AutoMerk ford;

    public Dealer(){
        System.out.println(type);
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

    public void makeBenzineCar(String klasse, AutoMerk autoMerk, Color kleur){

        BenzineAuto newCar = bmw.UitstootMaken(klasse, kleur, autoMerk);

        System.out.println("Holy fuck first try, ");
        BenzineAutos.add(newCar);
        BenzineAuto BenzineAutoB = BenzineAutos.get(0);
        BenzineAutoB.informatie();
    }
}
