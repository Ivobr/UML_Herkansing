package code;


public class Gonderhandelaar implements Onderhandeling {
    private float winstmarge = 0.10f;

    @Override
    public int onderhandelPrijs(Integer nieuwPrijs, Klant klant) {
    
        float prijsmetwinst = nieuwPrijs * (1 + winstmarge);
        int budget = klant.getBudget();
               System.out.println("onderhandeling gestart voor klant met budget:  " + budget + " aankoopprijs auto is  " + prijsmetwinst);
        if (prijsmetwinst <= budget) {
            System.out.println("onderhandeling succesvol de onderhandelde prijs is: " + prijsmetwinst);
            return (int)prijsmetwinst;
        } 
        
        else {
            System.out.println("onderhandeling mislukt. prijs is hoger dan budget, klant vragen voor hoger budget");
            int verhoogdbudget = klant.vraagHogerBudget();
            if(verhoogdbudget >= prijsmetwinst){
                System.out.println("succesvol onderhandeld na verhoging budget, afgesproken prijs " + prijsmetwinst);
                return (int)prijsmetwinst;
            } else {
                System.out.println("prijs nogsteeds te hoog voor klant ");
                prijsmetwinst *= 0.95; 
                System.out.println("dealer verlaag prijs voor laatse keer met 5% " + prijsmetwinst);
                if(prijsmetwinst <= verhoogdbudget){
                    System.out.println("toch gelukt na deze verlaging " + prijsmetwinst);
                    return (int)prijsmetwinst;
                } else {
                    System.out.println("nogsteeds te duur");
                    return 0;
                }

            }

        }
    }
}