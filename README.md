# Virtuell-Biluthyrning
Projekt: 
En applikation för biluthyrnigstjänst 

Projketets syfte: 
Användaren ska kunna hyra ut olika typer av fordon, retunera dessa samt se kostnader för varje uthyrning. 

Programmets körning: 
1. Skapa fordon: i Main-metoden skapas instanser av olika typer av fordon med specifikationer som modell, registreringsnummer, hyrespris per dag samt antal dörrar.
2. Uthyrning av fordon: I detta fall sätter programmet ut ett antal hyresdagar (5). För varje metod kallas metoden rentOut(rentalDays) för att hyra ut fordonet under det angivna antal dagar.
3. Detaljer för fordon: Detaljer för varje fordon visas efter uthyrning med hjälp av metoden displayDetails(). Den visar även information om fordonets modell, reg.nummer, hyrespris/dag samt specifika egenskaper för varje fordon.
4. Retunera fordon: För att retunera ett fordon används metoden returnVehicle(), detta signalerar att fordonet har återlämnats.
