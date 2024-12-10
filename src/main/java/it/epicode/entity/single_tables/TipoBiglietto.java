package it.epicode.entity.single_tables;

import it.epicode.entity.Mezzo;
import it.epicode.entity.Utente;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tipo_biglietto")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TipoBiglietto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private LocalDate dataEmissioneB;
    private boolean validita =true;

    @ManyToOne
    @JoinColumn(name = "biglietteria_id")
    private Biglietteria biglietteria;

    @ManyToOne
    @JoinColumn(name = "mezzo_id")
    private Mezzo mezzo;

    @OneToOne(mappedBy = "tipo_biglietto")
    private Utente titolareBiglietto;

    //nel caso dell'id solo get perché id autogenerato e seter non si deve fare
    public Long getId(){
        return id;
    }
    public TipoBiglietto(  Biglietteria biglietteria){
       this.biglietteria = biglietteria;
        this.dataEmissioneB = LocalDate.now();
    }
    public TipoBiglietto(){}
  public boolean getValidita (){
        return validita;
  }
public  void setValidita (boolean validita){
        this.validita = validita;
}
public Biglietteria getBiglietteria(){
        return biglietteria;
}
public void setBiglietteria( Biglietteria biglietteria){
        this.biglietteria = biglietteria;
}

public LocalDate getDataEmissioneB (){
        return dataEmissioneB;
}
 public void setDataEmissioneB ( LocalDate dataEmissioneB){
        this.dataEmissioneB = dataEmissioneB;
 }
public Mezzo getMezzo(){
        return mezzo;
}
public void setMezzo(Mezzo mezzo){
        this.mezzo= mezzo;
}
}
