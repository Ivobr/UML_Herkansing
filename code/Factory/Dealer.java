package code.Factory;

import java.util.ArrayList;

public class Dealer {
    public String type = "Opium";
    ArrayList<BenzineAuto> BenzineAutos = new ArrayList<>();
    ArrayList<ElektrischeAuto> ElektrischeAutos = new ArrayList<>();

    public Dealer(){
        System.out.println(type);
    }

    public void WhatForSale(){
        System.out.println("Kleur, soort, merk: " + BenzineAutos);
        System.out.println("Kleur, soort, merk: " + ElektrischeAutos);
    }

    public static BenzineAuto makeBenzineCar(FabriekManager fabriekManager, AutoFabriek fabriek, Color kleur){
        BenzineAuto newCar = fabriekManager.makeBenzineAuto(fabriek, kleur);
        System.out.println("Holy fuck first try");
        return newCar;
    }
}
