package code;

import java.util.ArrayList;

public class Dealer {
    ArrayList<BenzineAuto> BenzineAutos = new ArrayList<BenzineAuto>();
    ArrayList<ElektrischeAuto> ElektrischeAutos = new ArrayList<>();
    AutoMerk bmw;
    AutoMerk audi;
    AutoMerk ford;
    Bank wittebank;
    String land;

    public Dealer(){
    }
    public void setBank(Bank bank){
        this.wittebank = bank;
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
// Transfer elektrische auto naar klant, 
    public void transferCarElectric(Klant k) { 
        if (k.getLand() != null) {
            if ( k.getLand() == "USA") { 
                ElektrischeAuto Verkoop =  getFirstE();
         
                System.out.println("Price in USA: " + wittebank.GetLocalPrice(Verkoop.getprijs(), k.getLand())); // Bank verrekent prijs naar lokale valuta


                // check of klant genoeg saldo heeft
                if(k.getSaldo() > wittebank.GetLocalPrice(Verkoop.getprijs(), k.getLand())){
                    k.verrekenkosten(wittebank.GetLocalPrice(Verkoop.getprijs(), k.getLand()));
                     k.buyCar(Verkoop); // auto toeveogen aan de klant

                ElektrischeAutos.removeFirst(); // auto verwijderen uit dealer voorraad
                } else {
                    System.out.println("broke");
                    return;
                }
               
            }
            else if( k.getLand() == "UK"){
                ElektrischeAuto Verkoop =  getFirstE();
              
                System.out.println("Price in UK: " + wittebank.GetLocalPrice(Verkoop.getprijs(), k.getLand()));

                if(k.getSaldo() > wittebank.GetLocalPrice(Verkoop.getprijs(), k.getLand())){
                    k.verrekenkosten(wittebank.GetLocalPrice(Verkoop.getprijs(), k.getLand()));
                     k.buyCar(Verkoop); // auto toeveogen aan de klant 

                ElektrischeAutos.removeFirst(); // auto verwijderen uit dealer voorraad
                }
                else {
                    System.out.println("broke boy");
                    return;
                };
               
            }
        }
    }

    public void transferCarBenzine(Klant k) { 
        if (k.getLand() != null) {
            if ( k.getLand() == "USA") { 
                BenzineAuto verkoop = getFirstB();
                //   wittebank.GetLocalPrice(verkoop.getprijs(), land);
                System.out.println("Price in USA: " + wittebank.GetLocalPrice(verkoop.getprijs(), k.getLand())); 
                if(k.getSaldo() > wittebank.GetLocalPrice(verkoop.getprijs(), k.getLand())){
                    k.verrekenkosten(wittebank.GetLocalPrice(verkoop.getprijs(), k.getLand()));
                    k.buyCar(verkoop);
                    BenzineAutos.removeFirst();
                } else {
                    System.out.println("broke boy");
                    return; 
                }
                
            }
            else if( k.getLand() == "UK"){
                BenzineAuto verkoop = getFirstB();
                //   wittebank.GetLocalPrice(verkoop.getprijs(), land);
                System.out.println("Price in UK: " + wittebank.GetLocalPrice(verkoop.getprijs(), k.getLand())); 

                if(k.getSaldo() > wittebank.GetLocalPrice(verkoop.getprijs(), k.getLand())){

                    k.verrekenkosten(wittebank.GetLocalPrice(verkoop.getprijs(), k.getLand()));
                    k.buyCar(verkoop);
                    BenzineAutos.removeFirst();
                }
                else {
                    System.out.println("broke boy");
                    return; 
                }
                

                
            }
        }
        
    }

    public ElektrischeAuto getFirstE(){
        if(!ElektrischeAutos.isEmpty()){
            ElektrischeAuto Verkoop =  ElektrischeAutos.getFirst();
            // wittebank.GetLocalPrice(Verkoop.getprijs(), land);
            // ElektrischeAutos.removeFirst();
            return Verkoop;
        }
        return null;
    }
    public BenzineAuto getFirstB(){
        if(!BenzineAutos.isEmpty()){
            BenzineAuto verkoop = BenzineAutos.getFirst();
            //   wittebank.GetLocalPrice(verkoop.getprijs(), land);
            // BenzineAutos.removeFirst();
            return verkoop;
        }
        return null;
    }


}
