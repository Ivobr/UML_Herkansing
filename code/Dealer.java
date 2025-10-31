package code;

import java.util.ArrayList;

public class Dealer {
    ArrayList<BenzineAuto> BenzineAutos = new ArrayList<BenzineAuto>();
    ArrayList<ElektrischeAuto> ElektrischeAutos = new ArrayList<>();
    AutoMerk bmw;
    AutoMerk audi;
    AutoMerk ford;
    Currency converter;
    private String land;

    public Dealer(){
       
    }

    public void setLand(String land){
        this.land = land;
    }

    public void setConverter(Currency converter){
        this.converter = converter;
    }

    public void SetMerken(AutoMerk bmws, AutoMerk audis, AutoMerk fords){

        bmw = bmws;
        ford = fords;
        audi = audis;
    }
    public void WhatForSale(){
        System.out.println("Kleur, soort, merk: ------------- " );
        for (BenzineAuto benzineAuto : BenzineAutos) {
            benzineAuto.informatie();
        }
        System.out.println("Kleur, soort, merk: -------------------- " );
        for (ElektrischeAuto elektrischeAuto : ElektrischeAutos) {
            elektrischeAuto.informatie();
        }
    }

    public void makeBenzineCar(int belastinSchaal, AutoMerk autoMerk, Color kleur){

        String merk = autoMerk.getMerk();
        switch(merk){
            case "Audi":
                BenzineAuto newAudi = audi.UitstootMaken(belastinSchaal, kleur, autoMerk);
                newAudi.setlokalePrijs(converter.GetLocalPrice(newAudi.getProductiePrijs(), land)) ;
                
                BenzineAutos.add(newAudi);
                break;
            case "Ford":
                BenzineAuto newFord = ford.UitstootMaken(belastinSchaal, kleur, autoMerk);
                newFord.setlokalePrijs(converter.GetLocalPrice(newFord.getProductiePrijs(), land)) ;
                BenzineAutos.add(newFord);
                break;
            case "BMW":
                BenzineAuto newBMW = bmw.UitstootMaken(belastinSchaal, kleur, autoMerk);
                newBMW.setlokalePrijs(converter.GetLocalPrice(newBMW.getProductiePrijs(), land)) ;
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
                newAudi.setlokalePrijs(converter.GetLocalPrice(newAudi.getProductiePrijs(), land)) ;
                ElektrischeAutos.add(newAudi);
                
                break;
            case "Ford":
                ElektrischeAuto newFord = ford.ZuinigMaken(belastinSchaal, kleur, autoMerk);
                newFord.setlokalePrijs(converter.GetLocalPrice(newFord.getProductiePrijs(), land)) ;
                ElektrischeAutos.add(newFord);
                break;
            case "BMW":
                ElektrischeAuto newBMW = bmw.ZuinigMaken(belastinSchaal, kleur, autoMerk);
                newBMW.setlokalePrijs(converter.GetLocalPrice(newBMW.getProductiePrijs(), land)) ;
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
}
