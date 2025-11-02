# Verslag

Thomas Blokdijk (1069992), Ivo Bruinsma (1082102), Thomas van Moolenbroek(1072869), Mees van der Waal (1052159)

02/11/2025
Eerste Kans

## Werking van Design Diagram in verhaal vorm

Stel je voor, je wilt een auto kopen. Dan heb je waarschijnlijk verschillende [`wensen`](#wensen) en een budget waar de auto aan moet voldoen.
Zeker van je zaak loop jij de [`dealership`](#bijlagen) in, op zoek naar jouw droomauto. Jij zegt tegen de dealer welk merk je wilt en of je een benzine of elektrische auto wilt.

Jij wilt een goedkope [`BMW`](#automerk) die op benzine rijdt. De dealer brengt je de showroom in met meerdere goedkope BMW's, met allemaal verschillende [`kleuren`](#kleuren), waaronder Blauwe, Groene, Rode en Blanke (zonder een speciale kleur).

Jij ziet hem staan, de rode BMW, en zegt tegen de dealer: "Ik wil de rode BMW in het hoekje." Alleen, [`de dealer vraagt of je die auto wel kan betalen.`](#onderhandeling) En dat kan je niet, want het is net boven budget en je hebt geen extra budget. Gelukkig is de dealer heel vriendelijk en hij zegt: "Ik kan wel 5% zakken, gaat het dan wel lukken?" Met die 5% korting kom je onder het budgetplafond uit en dus gaat dat wel lukken. "Goed," zegt de dealer, "kom hem maar over 3 millisecondes ophalen."

De dealer gaat naar de manager van BMW toe om te praten over de auto. Hij vertelt tegen BMW dat de klant graag een goedkope, rode auto wilt hebben.
Bmw zegt: "Komt goed, wij zullen het regelen voor de klant," en gaat praten met de [`FabriekManager`](#FabrieksManager).

De FabrieksManager gaat aan het werk met de auto, en geeft de opdracht aan de [`goedkope fabriek`](#GFabriek) van hem om een goedkope rode BMW te maken die op benzine rijdt.
Na een paar nanoseconden hard werken in de fabriek, komt de auto weer terug bij de fabrieks manager, die hem weer terug brengt naar BMW, en vanaf BMW komt die bij de dealership terecht.

Het laatste wat moet gebeuren is dat de auto nog betaald moet worden met de 5% korting die is beloofd.
Na een beetje rekenwerk wordt de nieuwe prijs bepaald en betaald.

<div style="page-break-after: always;"></div>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
## Bijlagen

### Wensen:
```
public Klant(Color kleur, AutoMerk merk, String gekozenPartij, int budget){
        this.kleur = kleur;
        this.merk = merk;
        this.budget = budget;
        this.GekozenPartij = gekozenPartij;
    }
```
### DealerShip
```
public class Dealer {
    ArrayList<BenzineAuto> BenzineAutos = new ArrayList<BenzineAuto>();
    ArrayList<ElektrischeAuto> ElektrischeAutos = new ArrayList<>();
    AutoMerk bmw;
    AutoMerk audi;
    AutoMerk ford;
    Onderhandeling Gonderhandel;
    Onderhandeling Donderhandel;
```
### AutoMerk
```
public interface AutoMerk {
    String getMerk();
   void setManagers(FabriekManager GManager, FabriekManager DManager);
   BenzineAuto UitstootMaken(int belastingSchaal, Color kleur, AutoMerk merk);
   ElektrischeAuto ZuinigMaken(int belastingSchaal, Color kleur, AutoMerk merk);
}
```
### Kleuren
```
public interface Color {

    String colorName();

    Integer prijs();
}
```
### Onderhandeling
```
interface Onderhandeling {
   
    int onderhandelPrijs(Integer nieuwPrijs,  Klant klant);

}
```
### FabrieksManager
```
    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;
    private AutoFabriek fabriek;
    public FabriekManager(AutoFabriek fabriek){
        this.fabriek = fabriek;
    }

```
### GFabriek
```
public class GFabriek implements AutoFabriek {
    @Override
    public BenzineAuto createBenzineAuto(Color kleur, AutoMerk merk) {
        return new GAutoBenzine(kleur, merk);
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(Color kleur, AutoMerk merk) {
        return new GAutoElektrisch(kleur, merk);
    }
} 
```