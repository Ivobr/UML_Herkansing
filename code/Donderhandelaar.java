package code;


public class Donderhandelaar implements Onderhandeling {
    private float winstmarge = 0.70f;

    @Override
    // Onderhandel met de klant over prijs
    public int onderhandelPrijs(Integer nieuwPrijs, Klant klant) {
        System.out.println(klant.getsaldo());
        float prijsmetwinst = nieuwPrijs * (1 + winstmarge);
        float budget = klant.getBudget();
        System.out.println("onderhandeling gestart voor klant met budget:  " + (int) budget + " aankoopprijs auto is  " + (int) prijsmetwinst);
        if (prijsmetwinst <= budget) {
            System.out.println("onderhandeling succesvol! De onderhandelde prijs is: " + (int) prijsmetwinst);
            return (int) prijsmetwinst;
        } else {
            System.out.println("onderhandeling mislukt. prijs is hoger dan budget, klant vragen voor hoger budget");
            int verhoogdbudget = klant.vraagHogerBudget();
            if (verhoogdbudget >= prijsmetwinst) {
                System.out.println("succesvol onderhandeld na verhoging budget, afgesproken prijs " + (int) prijsmetwinst);
                return (int) prijsmetwinst;
            } else {
                System.out.println("prijs nogsteeds te hoog voor klant ");
                prijsmetwinst *= 0.95;
                System.out.println("dealer verlaag prijs voor laatse keer met 5% " + (int) prijsmetwinst);
                if (prijsmetwinst <= verhoogdbudget) {
                    System.out.println("toch gelukt na deze verlaging " + (int) prijsmetwinst);
                    return (int) prijsmetwinst;
                } else {
                    System.out.println("nogsteeds te duur");
                    return 0;
                }

            }
            // ask for a higher budget
        }
    }
}