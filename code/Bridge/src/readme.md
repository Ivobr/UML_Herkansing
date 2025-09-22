# Bridge
De bridge werkt op de Benzine en Elektrische auto interface

De interface zelf krijgt ``informatie()`` erbij om de kleur op te vragen/printen.

Er komt een interface genaamd ``Color`` bij.

In deze interface wordt functie van ``String colorName()`` aangemaakt. Hierin komt de naam van de kleur te staan.

De child classes van ``Color`` hebben een String met de naam van de kleur welke wordt gekoppeld in de ``String colorName()`` functie.

Bij het maken van een auto moet de kleur worden meegegeven via ``new DAutoBenzine(new Red());``

In de ``DAutoBenzine`` wordt de informatie van de kleur opgevraagd in ``blueCar.informatie()``