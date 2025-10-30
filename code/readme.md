
# Hoe werkt de code?
Je vraagt je vast af.

"Ivo hoe werkt deze mooie code die jij gemaakt hebt. Oh goede codeur leg het me alsjeblieft uit."

We beginnen in het begin der tijden.\
God maakte op de eerste dag de aarde.

En een paar duizend jaar later bestaat java en hebben wij een werkende fabriek gemaakt.

Pak de UML erbij dan gaan we lekker kijken hoe alles werkt.\
We beginnen bij de ``<BenzineAuto>`` en ``<ElektrischeAuto>`` Dit zijn DE interfaces waar alles om draait.\
Dit zijn de auto's. Hier heb je een goedkope en dure variant van. Deze worden gemaakt in een goedkope of dure fabriek met een manager.

De interfaces hebben maar 1 method genaamd `void informatie()` deze wordt in elke auto gebruikt om alle informatie op te vragen; prijs, kleur, merk, enz.\
De autos zelf hebben ook nog een method waarbij de waardes van merk, kleur en prijs worden gekoppeld. `DAutoBenzine(Color color, AutoMerk merk)`

Maar nu denk je vast\
"O wat mooi gedaan o heilige Ivo maar hoe maak ik dan zo'n mooi ontworpen auto??"\
Nou heel simpel

**Factory**\
In de fabriek natuurlijk ezel.\
Je hebt een goedkope en dure fabriek. Werken beide het zelfde alleen in de goedkope kan je geen dure maken natuurlijk ezel.\
In de interface `AutoFabriek` wordt bepaald dat beide fabrieken de method `createBenzineAuto(Color kleur, AutoMerk merk)` & `createElektrischeAuto(Color kleur, AutoMerk merk)` hebben.\
Beide van het type Benzine- of ElektrischeAuto.\
De fabriek zelf zit nog makkelijker in elkaar dan het fixen van je moeder vannacht. (en dat was makkelijk)\
Twee methodes;

```
    @Override
    public BenzineAuto createBenzineAuto(Color kleur, AutoMerk merk) {
    return new GAutoBenzine(kleur, merk); //DAutoBenzine in de dure fabriek ofc
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(Color kleur, AutoMerk merk) {
        return new GAutoElektrisch(kleur, merk);
    }
```
Simpel he?\
Dat zei je moeder gisteren ook.

Maar jij zal nu vast denken.\
"Maar Erwin ik ben niet zo slim hoe verf ik een auto?"\
Gelukkig heet ik geen Erwin maar weet ik wel hoe je een auto kleur geeft.\
Je maakt in de main gewoon een kleur object aan en geeft die steeds door in de parameters.

Maar jij bent zo dom dat je nu zelfs moet vragen.\
"Ohh heilige Ivo er staat maar 1 manager in de UML hoe gaat hij alle fabrieken runnen?"\
Niet man domme oetlul.\
Je maakt in het begin gewoon twee managers en koppelt elke manager aan een fabriek\
```
public static FabriekManager setupG(){

        AutoFabriek GFabriek = new GFabriek();
        FabriekManager GManager = new FabriekManager(GFabriek);

        System.out.println("Goedkope Fabriek Runt");
        System.out.println(" ");

        return GManager;
    }
```

Zie zo moeilijk is het niet.

De manager werkt best simpel.\
Je geeft een fabriek mee (Dat wist je al want je hebt de code hiervoor gelezen).\
Maar stel de manager wilt niet alleen maar masten maar ook een auto maken dan roep je:\
`public BenzineAuto makeBenzineAuto(AutoFabriek fabriek, Color kleur, AutoMerk merk)` of elektrisch ofc\
De fabriek welke wordt gebruikt wordt bepaald door welke is meegegeven en wordt opgevraagd via `getFabriek()`.\
Dan wordt in make*type*Auto de fabriek aangeroepen om de auto te maken (je weet al hoe dat werkt man yeti)

## Auto merken
ahhh je ego is zo klein dat je een specifiek merk auto moet rijden om te compenseren van de grote van je penis???\
Oke goed dan hier je merken;

Audi, Ford en BMW

Alles komt van de inteface `<AutoMerk>` met 3 simpele en 1 wat raardere method.\
`String getMerk()` returnt een string met de naam van het merk nie moeilijk.\
`UitstootMaken(int belastingSchaal, Color kleur, AutoMerk merk)` Hier wordt de benzineAuto gemaakt. Er wordt ook even gekeken in welke belastingschaal je zit om te bepalen of je een dure of goedkope auto krijgt.
De Color kleur en AutoMerk merk worden gewoon doorgegeven aan de fabriekmanager die dan gaat masten en een automaakt.\
`SetManagers(FabrieksManager GManager, FabrieksManager DManager)` Deze bestaat om te voorkomen dat er 2 fabrieken PER merk zijn.
Je geeft via de main de gemaakte managers mee aan het merk. Hierdoor als het merk een auto aanroept wordt voor elk merk de zelfde manager gebruikt\

Maar ja ome robert wil graag een auto kopen.\
(Ome robert leeft van een uitkeering in de kooistee dus de automerken willen niet met hem praten)\
Hier komt de Dealer van pas.\
Nee ome robert hij verkoopt geen ketamine\
De dealer krijgt connectie met elk merk via `SetMerk(AutoMerk bmws, AutoMerk audis, AutoMerk fords)`\
LET OP bij het maken van de dealer moeten de AutoMerk objecten dus al bestaan.\
De dealer 2 methods voor het "maken" van autos\
make elektrisch en goedkoop. Hier wordt de wens van Ome robert gepakt en het juiste merk aangeroepen voor de juiste auto.
```
    public void makeElektrischeAuto(int belastinSchaal, AutoMerk autoMerk, Color kleur){
    String merk = autoMerk.getMerk();

        switch(merk){
            case "Audi":
                ElektrischeAuto newAudi = audi.ZuinigMaken(belastinSchaal, kleur, autoMerk);
                ElektrischeAutos.add(newAudi);
                break;
            case "Ford":
                ElektrischeAuto newFord = ford.ZuinigMaken(belastinSchaal, kleur, autoMerk);
                ElektrischeAutos.add(newFord);
                break;
            case "BMW":
                ElektrischeAuto newBMW = bmw.ZuinigMaken(belastinSchaal, kleur, autoMerk);
                ElektrischeAutos.add(newBMW);
                break;
        }
        ElektrischeAuto elek = ElektrischeAutos.getFirst();
        elek.informatie();
    }
```

Na het terug krijgen van de auto gaat die in een ArrayList en kan Ome robert hem zo kopen.