package ch.bbbaden.m426.lb803;

import java.util.ArrayList;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Manuel Bachofner
 */
public class Chiffrierer {

    private final ArrayList<Chiffriermethode> methoden = new ArrayList<>();
    private final StringProperty eingabe = new SimpleStringProperty();
    private final StringProperty log = new ReadOnlyStringWrapper();
    private final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private final Caesar caesar = new Caesar();
    private final Transposition transposition = new Transposition();
    private final Kamasutra kamasutra = new Kamasutra();

    public void fuehreAus(Chiffriermethode methode) {

        methoden.add(methode);

        String eingabeV = eingabe.getValue();
        switch (methode) {
            case Caesar:
                eingabe.setValue(caesar.chiffriren(eingabeV));

                break;
            case Transposition:
                eingabe.setValue(transposition.chiffriren(eingabeV));
                break;
            case Kamasutra:
               eingabe.setValue(kamasutra.chiffriren(eingabeV));
                break;
        }

        doit();

    }

    public void macheRueckgaenig() {
        if (methoden.size() > 0) {
            Chiffriermethode methode = methoden.remove(methoden.size() - 1);
            switch (methode) {
                case Caesar:
                    eingabe.setValue(caesar.dechiffriren(eingabe.getValue()));
                    break;
                case Transposition:
                   eingabe.setValue(transposition.dechiffriren(eingabe.getValue()));
                    break;
                case Kamasutra:
                   eingabe.setValue(kamasutra.dechiffriren(eingabe.getValue()));
                    break;
            }
            doit();
        }
    }

    public void leereLog() {
        methoden.clear();
        doit();
    }

    //Private Methoden -----------------------------------------------------------------
    public StringProperty getEingabe() {
        return eingabe;
    }

    /*
    * getLog
     */
    public StringProperty getLog() {
        return log;
    }

    /*
    *   Leeren der Methoden im Log
     */
    private void doit() {
        StringBuilder sb = new StringBuilder();
        for (Chiffriermethode methode : methoden) {
            sb.append(methode);
            sb.append(" ");
        }
        log.setValue(sb.toString());
    }

  

    private boolean ueberpruefeChiffre() {
        for (Chiffriermethode m : methoden) {
            switch (m) {
                case Caesar:
                    return true;
                case Transposition:
                    return false;
                default:
                    return true;
            }
        }
        return false;
    }

   


}
