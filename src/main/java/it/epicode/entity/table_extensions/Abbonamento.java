package it.epicode.entity.table_extensions;

import it.epicode.entity.Tessera;
import it.epicode.entity.single_tables.TipoBiglietto;
import it.epicode.enums.TipoAbbonamento;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "abbonamenti")
public class Abbonamento extends TipoBiglietto {
    @Enumerated(EnumType.STRING)
    private TipoAbbonamento tipoAbbonamento;

    @ManyToOne
    @JoinColumn(name = "tessera_id")
    private Tessera tessera;

    public Tessera getTessera(){
        return tessera;
    }
    public void setTessera(Tessera tessera) {
        this.tessera = tessera;
    }
}
