package com.exam.domain;

import com.exam.enumeration.TipoCliente;
import com.exam.interfaccia.AcquirenteInterfaccia;

public class Acquirente implements AcquirenteInterfaccia {

    private String nome;

    private String cognome;

    private TipoCliente tipoCliente;

    private Double puntiAccumulati;

    public Acquirente(String nome, String cognome, Double puntiAccumulati) {
        this.nome = nome;
        this.cognome = cognome;
        this.puntiAccumulati = puntiAccumulati;
    }

    public Acquirente() {}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCognome() {return cognome;}

    public void setCognome(String cognome) {this.cognome = cognome;}

    public TipoCliente getTipoCliente() {return tipoCliente;}

    public void setTipoCliente(TipoCliente tipoCliente) {this.tipoCliente = tipoCliente;}

    public Double getPuntiAccumulati() {return puntiAccumulati;}

    public void setPuntiAccumulati(Double puntiAccumulati) {this.puntiAccumulati = puntiAccumulati;}

    @Override
    public String toString() {
        return "Acquirente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", puntiAccumulati=" + puntiAccumulati +
                '}';
    }

    @Override
    public void calcolaPunti(Double punti) {}
}
