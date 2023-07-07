package com.exam.domain;

import com.exam.enumeration.TipoCliente;
import com.exam.interfaccia.AcquirenteInterfaccia;

public class AcquirenteStandard extends Acquirente implements AcquirenteInterfaccia {


    public AcquirenteStandard(String nome, String cognome, Double puntiAccumulati) {
        super(nome, cognome, puntiAccumulati);
        this.setTipoCliente(TipoCliente.STANDARD);
    }

    public AcquirenteStandard() {}

    @Override
    public void calcolaPunti(Double punti) {
        setPuntiAccumulati(punti * 1.33 + this.getPuntiAccumulati());
    }
}
