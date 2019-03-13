/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.m426.lb803;

/**
 *
 * @author Lukas
 */
public class Kamasutra implements ChiffrierTechniken{

    @Override
    public String chiffriren(String eingabe) {
      String schluessel = "T5tIi0Bb1PpW2wQq3LlXx4CcJjEeY6yGgAa7UuRrOoFfZzMmS9sVvDdNn8KkHh";

                StringBuilder chiffratk = new StringBuilder();

                for (int i = 0; i < eingabe.length(); i++) {
                    char buchstabe = eingabe.charAt(i);
                    int chiffratIndex;
                    int index = schluessel.indexOf(buchstabe);
                    if (index < schluessel.length() / 2) {
                        chiffratIndex = index + schluessel.length() / 2;
                    } else {
                        chiffratIndex = index - schluessel.length() / 2;
                    }
                    chiffratk.append(schluessel.charAt(chiffratIndex));
                }
               return chiffratk.toString();
    }

    @Override
    public String dechiffriren(String eingabe) {
    //funktioniert gleich wie beim Chiffrieren
        String schluessel = "T5tIi0Bb1PpW2wQq3LlXx4CcJjEeY6yGgAa7UuRrOoFfZzMmS9sVvDdNn8KkHh";

        StringBuilder chiffrat = new StringBuilder();
       
        for (int i = 0; i < eingabe.length(); i++) {
            char buchstabe = eingabe.charAt(i);
            int chiffratIndex;
            int index = schluessel.indexOf(buchstabe);
            if (index < schluessel.length() / 2) {
                chiffratIndex = index + schluessel.length() / 2;
            } else {
                chiffratIndex = index - schluessel.length() / 2;
            }
            chiffrat.append(schluessel.charAt(chiffratIndex));
        }
        return chiffrat.toString();
    }
    
}
