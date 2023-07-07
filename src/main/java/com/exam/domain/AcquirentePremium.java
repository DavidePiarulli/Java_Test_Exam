package com.exam.domain;

import com.exam.enumeration.TipoCliente;
import com.exam.interfaccia.AcquirenteInterfaccia;

public class AcquirentePremium extends Acquirente implements AcquirenteInterfaccia {


    private Integer moltiplicatore = 2;


    public AcquirentePremium(String nome, String cognome, Double puntiAccumulati) {
        super(nome, cognome, puntiAccumulati);
        this.setTipoCliente(TipoCliente.PREMIUM);
    }

    public AcquirentePremium() {}

    public Integer getMoltiplicatore() {return moltiplicatore;}

    public void setMoltiplicatore(Integer moltiplicatore) {this.moltiplicatore = moltiplicatore;}

    @Override
    public void calcolaPunti(Double punti) {
        setPuntiAccumulati(punti * moltiplicatore + this.getPuntiAccumulati());
        moltiplicatore += 5;
    }
}
