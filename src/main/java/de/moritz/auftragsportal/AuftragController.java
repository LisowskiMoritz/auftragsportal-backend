package de.moritz.auftragsportal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuftragController {
    @GetMapping("/auftraege")
    public List<Auftrag> getAuftraege() {
        return List.of(
                new Auftrag(
                        1L,
                        "Schloss gangbar machen und Schlüssel anfertigen", "In Bearbeitung", "Das Schloss ist wieder funktionstüchtig. Schlüssel ist angefertigt." ),
                new Auftrag(
                        2L,
                        "Zylunderbestellung Hausverwaltung", "Abholbereit", "Ihre Bestellung kann im Laden abgeholt werden.")
        );

    }
}
