package it.epicode.entity.single_tables;

import it.epicode.entity.Utente;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "biglietterie")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Biglietteria {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String posizione;

    public Long getId(){
        return id;
    }

    public String getPosizione (){
        return posizione;
    }
    public void setPosizione (String posizione){
        this.posizione = posizione;
    }


}
