package code;

import java.util.LinkedList;

public class Main{
    public static int keuze = 0;
    public static AutoMerk bmw;
    public static AutoMerk audi;
    public static AutoMerk ford;
    public static Dealer dealership;


    public static Dealer setupDealer(FabriekManager GManager, FabriekManager DManager, Onderhandeling gonderhandel, Onderhandeling donderhandel){
        dealership = new Dealer();
        bmw = new BMW();
        audi = new Audi();
        ford = new Ford();
        bmw.setManagers(GManager, DManager);
        audi.setManagers(GManager, DManager);
        ford.setManagers(GManager, DManager);
        dealership.Gonderhandel = new Gonderhandelaar();
        dealership.Donderhandel = new Donderhandelaar();
        dealership.SetMerken(bmw, audi, ford);
        return dealership;
    }

    public static FabriekManager setupG(){

        AutoFabriek GFabriek = new GFabriek();
        FabriekManager GManager = new FabriekManager(GFabriek);

        System.out.println("Goedkope Fabriek Runt");
        System.out.println(" ");t

        return GManager;
    }

    public static FabriekManager setupD(){

       AutoFabriek DFabriek = new DFabriek();
       FabriekManager DManager = new FabriekManager(DFabriek);

       System.out.println("Dure fAbrIek runt");
       System.out.println(" ");

       return DManager;
    }


    public static void main(String[] args){
        LinkedList<Klant> klanten = new LinkedList<Klant>();
        FabriekManager GManager = setupG();
        FabriekManager DManager = setupD();
        Dealer dealership = setupDealer(GManager, DManager, new Gonderhandelaar(), new Donderhandelaar());


        Color Groen = new Green();
        Color Rood = new Red();
        Color Blauw = new Blue();
        Color geen = new Blank();


        Klant klant = new Klant(Groen, audi, "FVD", 29999);
        klanten.add(klant);

        Klant klant1 = new Klant(Rood, ford, "Groen Links", 60000);
        klanten.add(klant1);

        Klant klant2 = new Klant(geen, bmw, "FVD", 30001);
        klanten.add(klant2);aa

        System.out.println(klanten);



//        System.out.println(klanten);
        int size = klanten.size();
        for(int i = 0; i < size; i++){
            System.out.println(i);

            Klant geholpen = klanten.get(i);

            System.out.println(geholpen);

            AutoMerk merk = geholpen.getMerk();
            Color kleur = geholpen.getKleur();
            String type = geholpen.getGekozenPartij();

            int budget = geholpen.getBudget();
            System.out.println(type);
            if(type == "Groen Links"){
                dealership.makeElektrischeAuto(budget, merk, kleur);
            }else if (type == "FVD"){
                dealership.makeBenzineCar(budget, merk, kleur);
            }

        }

        dealership.WhatForSale();
        verkoop(klanten);

    }

    public static void verkoop(LinkedList<Klant> klanten){
        int size = klanten.size();
        for(int i = 0; i < size; i++){
            Klant verkopen = klanten.get(i);
            String soort = verkopen.getGekozenPartij();
            if(soort == "Groen Links"){
                dealership.transferElektrischeAuto(verkopen);
            }else if (soort == "FVD"){
                dealership.transferBenzineAuto(verkopen);

            }
        }
    }
}