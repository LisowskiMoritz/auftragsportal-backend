# Auftragsportal Schlüsseldienst

Für mein Projekt entwickle ich ein Kundenportal für einen Schlüsseldienst.
Kunden sollen über einen Zugangscode oder QR-Code den Status ihres
Auftrags und Hinweise zur Bearbeitung einsehen können.
Mitarbeiter sollen die Aufträge anlegen und aktualisieren können.

Für M1 gibt es eine Spring-Boot-Anwendung mit der Klasse Auftrag.
Die GET-Route /auftraege gibt zwei Beispielaufträge als JSON zurück.

Start: AuftragsportalApplication in IntelliJ ausführen.
Aufruf: http://localhost:8080/auftraege
