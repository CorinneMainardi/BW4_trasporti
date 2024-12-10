package it.epicode.entity;

import it.epicode.enums.TipoAbbonamento;
import it.epicode.enums.TipoMezzo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "mezzi")
public class Mezzo {
    @Enumerated(EnumType.STRING)
    private TipoMezzo tipoMezzo;
}
