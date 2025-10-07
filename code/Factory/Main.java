package code.Factory;

public class Main{

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
        Color kleur = new Blue();

        //Die cheap ass manager denkt yusu eff waggie te maken
        makeBenzineCar(GManager, GManager.getFabriek(), kleur);
        makeElektrischeAuto(GManager, GManager.getFabriek(), kleur);

        Color kleur2 = new Blank();
        //Deze getalenteerde jongen man is zich aan het voorbereiden een elegante auto te maken van een zeer hoge kwaliteit
        //Deze auto zal onder geen enkele voorwaarden in de handen komen van D4VD en er zal geen dode 15 jarige in komen te liggen
        makeBenzineCar(DManager, DManager.getFabriek(), kleur2);
        makeElektrischeAuto(DManager, DManager.getFabriek(), kleur2);


        GManager.informatie();
        System.out.println("Dure auto doet");
        GManager.rij();
        GManager.informatie();


    }
}