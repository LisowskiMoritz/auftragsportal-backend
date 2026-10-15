package de.moritz.auftragsportal;

public class Auftrag {

    private Long id;
    private String bezeichnung;
    private String status;
    private String kundenhinweis;

    public Auftrag(Long id, String bezeichnung, String status, String kundenhinweis) {
        this.id=id;
        this.bezeichnung = bezeichnung;
        this.status = status;
        this.kundenhinweis = kundenhinweis;
    }

    public Long getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getStatus() {
        return status;
    }

    public String getKundenhinweis() {
        return kundenhinweis;
    }
}
