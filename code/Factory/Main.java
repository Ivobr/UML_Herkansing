package code.Factory;

public class Main{
    public static int keuze = 0;

    public static Dealer setupDealer(FabriekManager GManager, FabriekManager DManager){
        Dealer dealership = new Dealer();
        AutoMerk bmw = new BMW();
        bmw.setManagers(GManager, DManager);

        dealership.SetMerken(bmw);
        return dealership;
    }

    public static FabriekManager setupG(){

        AutoFabriek GFabriek = new GFabriek();
        FabriekManager GManager = new FabriekManager(GFabriek);

        System.out.println("Goedkope Fabriek Runt");
        System.out.println(" ");

        return GManager;
    }

    public static FabriekManager setupD(){

       AutoFabriek DFabriek = new DFabriek();
       FabriekManager DManager = new FabriekManager(DFabriek);

       System.out.println("Dure fabriek runt");
       System.out.println(" ");

       return DManager;
    }

    public static BenzineAuto makeBenzineCar(FabriekManager fabriekManager, AutoFabriek fabriek, Color kleur){
        BenzineAuto newCar = fabriekManager.makeBenzineAuto(fabriek, kleur);
        return newCar;
    }

    public static ElektrischeAuto makeElektrischeAuto(FabriekManager fabriekManager, AutoFabriek fabriek, Color kleur){
        ElektrischeAuto newECar = fabriekManager.makeElektrischeAuto(fabriek, kleur);
        return newECar;
    }


    public static void main(String[] args){
        FabriekManager GManager = setupG();
        FabriekManager DManager = setupD();
        Dealer dealership = setupDealer(GManager, DManager);

        Color kleur = new Blue();

        dealership.makeBenzineCar(dealership.bmw, kleur);

//
//
//        //Die cheap ass manager denkt yusu eff waggie te maken
//        makeBenzineCar(GManager, GManager.getFabriek(), kleur);
//        makeElektrischeAuto(GManager, GManager.getFabriek(), kleur);
//
//        Color kleur2 = new Blank();
//        //Deze getalenteerde jongen man is zich aan het voorbereiden een elegante auto te maken van een zeer hoge kwaliteit
//        //Deze auto zal onder geen enkele voorwaarden in de handen komen van D4VD en er zal geen dode 15 jarige in komen te liggen
//        makeBenzineCar(DManager, DManager.getFabriek(), kleur2);
//        makeElektrischeAuto(DManager, DManager.getFabriek(), kleur2);
//        dealership.WhatForSale();
//
//
//        GManager.informatie();
//        System.out.println("Dure auto doet");
//        GManager.rij();
//        GManager.informatie();
//
//        Klant klant = new Klant();
//        System.out.println(klant.main());
//        keuze = klant.main();
//        System.out.println("Keuze: " + keuze);
//
//
//        System.out.println("Klant wilt");
//        Color klantKleur = Klant.getKleur();
//        System.out.println(klantKleur);
//
//        if(keuze == 1){
//            makeBenzineCar(DManager, DManager.getFabriek(), klantKleur);
//            DManager.informatie();
//        } else if (keuze == 2) {
//            makeBenzineCar(GManager, GManager.getFabriek(), klantKleur);
//            GManager.informatie();
//
//        } else if (keuze == 3) {
//            makeElektrischeAuto(DManager, DManager.getFabriek(), klantKleur);
//            DManager.informatie();
//        } else if (keuze == 4) {
//            makeElektrischeAuto(GManager, GManager.getFabriek(), klantKleur);
//            GManager.informatie();
//        }

    }
}