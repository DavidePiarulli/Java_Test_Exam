import com.exam.domain.AcquirentePremium;
import com.exam.domain.AcquirenteStandard;
import com.exam.domain.Lotteria;
import com.exam.domain.Vincita;
import com.exam.exception.NoWinnerException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        AcquirenteStandard acquirenteStandard1 = new AcquirenteStandard("Gianni", "Morandi",25.0);
        AcquirenteStandard acquirenteStandard2 = new AcquirenteStandard("Gigi", "Morandi", 11.0);
        AcquirentePremium acquirentePremium1 = new AcquirentePremium("Gianna", "Morandi", 2.0);
        AcquirentePremium acquirentePremium2 = new AcquirentePremium("Giovanna", "Morandi", 40.0);

        Vincita vincita1 = new Vincita("Prima Vincita 50" , 50.0);

        Lotteria lotteria1 = new Lotteria();

        lotteria1.aggiungiAcquirente(acquirenteStandard1);
        lotteria1.eseguiAcquisto(10.0);

        lotteria1.aggiungiAcquirente(acquirenteStandard2);
        lotteria1.aggiungiAcquirente(acquirentePremium1);
        lotteria1.eseguiAcquisto(5.0);

        lotteria1.aggiungiAcquirente(acquirentePremium2);
        lotteria1.eseguiAcquisto(5.0);

        try {
            lotteria1.controlloVincitore(vincita1, lotteria1.getListaAcquirentiStandard(), lotteria1.getListaAcquirentiPremium());
        } catch (NoWinnerException e) {
            LOGGER.log(Level.INFO, e.getMessage());
        }

    }

}
