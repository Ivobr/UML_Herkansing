package code.Bridge.src;

public class DAutoBenzine implements BenzineAuto{
    private Color color;
    private double ProductiePrijs = 21000;
    @Override
    public void vroom() {
        System.out.println("Goes vroom more expensive");
    }

    @Override
    public void informatie(){
        System.out.println("Zozo je hebt een dure auto");
        System.out.println("De specificaties van de auto zijn:");
        System.out.println("• Productie prijs: " + ProductiePrijs);
        sleep(3);
        ProductiePrijs =  ProductiePrijs * 1.5;
        System.out.println("• Ho wacht je hebt een dure auto. + 50%");
        System.out.println("• Productie prijs " + ProductiePrijs);
        sleep(3);
        System.out.println("• Kleur: " + color.colorName());
        System.out.println("    • Prijs: " + color.prijs() * 2);
        ProductiePrijs += color.prijs() * 2;
        System.out.println("• De fabriek moet wel winst maken: +25%: " + ProductiePrijs * 0.25);
        ProductiePrijs = ProductiePrijs * 1.25;
        sleep(5);
        System.out.println("• Bijna vergeten nog 21% BTW: " + ProductiePrijs * 0.21);
        ProductiePrijs =  ProductiePrijs * 1.21;
        sleep(3);
        System.out.println("Totaal prijs: " + ProductiePrijs);
        sleep(2);
    }

    public void sleep(int tijd){
        try {
            Thread.sleep(tijd * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
    public DAutoBenzine(Color color){
        this.color = color;
    }
}
