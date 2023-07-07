package com.exam.domain;

import com.exam.enumeration.TipoCliente;
import com.exam.exception.NoWinnerException;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lotteria {

    private Set<Acquirente> listaAcquirentiStandard = new LinkedHashSet<>();
    private Set<Acquirente> listaAcquirentiPremium = new LinkedHashSet<>();


    public Lotteria(Set<Acquirente> listaAcquirentiStandard, Set<Acquirente> listaAcquirentiPremium) {
        this.listaAcquirentiStandard = listaAcquirentiStandard;
        this.listaAcquirentiPremium = listaAcquirentiPremium;
    }

    public Lotteria() {}

    public Set<Acquirente> getListaAcquirentiStandard() {return listaAcquirentiStandard;}

    public void setListaAcquirentiStandard(Set<Acquirente> listaAcquirentiStandard) {this.listaAcquirentiStandard = listaAcquirentiStandard;}

    public Set<Acquirente> getListaAcquirentiPremium() {return listaAcquirentiPremium;}

    public void setListaAcquirentiPremium(Set<Acquirente> listaAcquirentiPremium) {this.listaAcquirentiPremium = listaAcquirentiPremium;}

    public void aggiungiAcquirente(Acquirente acquirente) {
            if(Objects.equals(acquirente.getTipoCliente() , TipoCliente.STANDARD))
                listaAcquirentiStandard.add(acquirente);
            else{
                listaAcquirentiPremium.add(acquirente);
        }
    }

    public void eseguiAcquisto(Double punti) {
        Set<Acquirente> listaAcquirenti = Stream.concat(listaAcquirentiStandard.stream(), listaAcquirentiPremium.stream())
                .collect(Collectors.toSet());
        for (Acquirente acquirente : listaAcquirenti) {
            acquirente.calcolaPunti(punti);
        }
    }

    public Acquirente controlloVincitore(Vincita vincita, Set<Acquirente> listaAcquirentiStandard, Set<Acquirente> listaAcquirentiPremium) throws NoWinnerException {
        Optional<Acquirente> winner = Stream.concat(listaAcquirentiStandard.stream(), listaAcquirentiPremium.stream())
                .filter(a -> a.getPuntiAccumulati() >= vincita.getPuntiNecessari())
                .findFirst();

        if (winner.isPresent()) {
            System.out.println("Abbiamo un vincitore: " + winner.get());
            return winner.get();
        }

        throw new NoWinnerException();  // No winner found, throw the NoWinnerException
    }



}
