package code.Factory;

public class Main{

    public static FabriekManager setupG(){
        Color kleur = new Red();
        AutoFabriek GFabriek = new GFabriek();
        FabriekManager GManager = new FabriekManager(GFabriek, kleur);

        System.out.println("Goedkope Fabriek Runt");

        return GManager;
    }

    public static FabriekManager setupD(){
       Color kleur = new Green();
       Color wholeLottaRed = new Red();
        AutoFabriek DFabriek = new DFabriek();
        FabriekManager DManager = new FabriekManager(DFabriek, kleur);

        System.out.println("Dure fabriek runt");

        return DManager;
    }

    public static BenzineAuto makeBenzineCar(FabriekManager fabriekManager, AutoFabriek fabriek){
        Color kleur = new Red();
        BenzineAuto newCar = fabriekManager.makeBenzineAuto(fabriek, kleur);

        return newCar;
    }

    public static ElektrischeAuto makeElektrischeAuto(FabriekManager fabriekManager, AutoFabriek fabriek){
        Color kleur = new Green();
        ElektrischeAuto newECar = fabriekManager.makeElektrischeAuto(fabriek, kleur);
        return newECar;
    }

    public static void main(String[] args){
        FabriekManager GManager = setupG();
        FabriekManager DManager = setupD();
        makeBenzineCar(GManager, GManager.getFabriek());
        makeElektrischeAuto(GManager, GManager.getFabriek());

        makeBenzineCar(DManager, DManager.getFabriek());
        makeElektrischeAuto(DManager, DManager.getFabriek());


        DManager.informatie();
        System.out.println("Dure auto doet");
        DManager.rij();
        DManager.informatie();


    }


}