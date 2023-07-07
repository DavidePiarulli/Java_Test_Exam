package com.exam.domain;

public class Vincita {

    private String titoloVincita;

    private Double puntiNecessari;

    public Vincita(String titoloVincita, Double puntiNecessari) {
        this.titoloVincita = titoloVincita;
        this.puntiNecessari = puntiNecessari;
    }

    public Vincita() {
    }

    public String getTitoloVincita() {
        return titoloVincita;
    }

    public void setTitoloVincita(String titoloVincita) {
        this.titoloVincita = titoloVincita;
    }

    public Double getPuntiNecessari() {
        return puntiNecessari;
    }

    public void setPuntiNecessari(Double puntiNecessari) {
        this.puntiNecessari = puntiNecessari;
    }

    @Override
    public String toString() {
        return "Vincita{" +
                "titoloVincita='" + titoloVincita + '\'' +
                ", puntiNecessari=" + puntiNecessari +
                '}';
    }
}
