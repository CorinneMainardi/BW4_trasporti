package it.epicode.entity;

import it.epicode.entity.table_extensions.Abbonamento;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "tessere")
public class Tessera {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID nrTessera;

    private LocalDate dataEmissione;
    private LocalDate dataScadenza;

    @OneToOne
    @JoinColumn(name = "utente_id")
    private Utente titolareTessera;

    @OneToOne
    @JoinColumn(name = "abbonamento_id")
    private Abbonamento abbonamento;
    public UUID getNrTessera(){
        return nrTessera;
    }
    public Tessera(){}

    public Tessera (Utente titolareTessera){
        this.titolareTessera = titolareTessera;
        this.dataEmissione = LocalDate.now();
        this.dataScadenza = dataEmissione.plusDays(365);
    }

    public Utente getTitolareTessera() {
        return titolareTessera;
    }
    public void setTitolareTessera(Utente titolareTessera){
        this.titolareTessera = titolareTessera;
    }

    public LocalDate getDataEmissione(){
        return dataEmissione;
    }

    public  void setDataEmissione( LocalDate dataEmissione){
        this.dataEmissione = dataEmissione;
    }

    public LocalDate getDataScadenza(){
        return  dataScadenza;
    }
    public void setDataScadenza( LocalDate dataScadenza){
        this.dataScadenza = dataScadenza;
    }
    public Abbonamento getAbbonamento(){
        return abbonamento;
    }
    public void setAbbonamento ( Abbonamento abbonamento){
        this.abbonamento = abbonamento;
    }

}
