package code.Factory;

public class Main{

    public static FabriekManager setupG(){
        Color Rood = new Red();
        Color Blauw = new Blue();
        Color Groen = new Green();
        Color geen = new Blank();

        AutoFabriek GFabriek = new GFabriek();
        FabriekManager GManager = new FabriekManager(GFabriek, Rood);

        System.out.println("Goedkope Fabriek Runt");

        return GManager;
    }

    public static FabriekManager setupD(){
       Color kleur = new Green();
        AutoFabriek DFabriek = new DFabriek();
        FabriekManager DManager = new FabriekManager(DFabriek, kleur);

        System.out.println("Dure fabriek runt");

        return DManager;
    }

    public static void main(String[] args){
        FabriekManager GManager = setupG();
        FabriekManager DManager = setupD();

        System.out.println("Goedkope auto doet");
        GManager.rij();
        GManager.informatie();

        System.out.println("Dure auto doet");
        DManager.rij();
        DManager.informatie();

    }


}