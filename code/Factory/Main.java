package code.Factory;

public class Main{

    public static FabriekManager setupG(){
        AutoFabriek GFabriek = new GFabriek();
        FabriekManager GManager = new FabriekManager(GFabriek);

        System.out.println("goedkope Fabriek Runt");

        return GManager;
    }

    public static FabriekManager setupD(){
        AutoFabriek DFabriek = new DFabriek();
        FabriekManager DManager = new FabriekManager(DFabriek);

        System.out.println("Dure fabriek runt");

        return DManager;
    }

    public static void main(String[] args){
        FabriekManager GManager = setupG();
        FabriekManager DManager = setupD();

        System.out.println("Goedkope auto doet");
        GManager.rij();

        System.out.println("Dure auto doet");
        DManager.rij();

    }


}