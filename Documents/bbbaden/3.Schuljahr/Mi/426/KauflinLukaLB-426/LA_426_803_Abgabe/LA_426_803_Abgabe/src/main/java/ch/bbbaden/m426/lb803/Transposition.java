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
public class Transposition implements ChiffrierTechniken{

    @Override
    public String chiffriren(String eingabe) {
      StringBuilder start = new StringBuilder();
                StringBuilder ende = new StringBuilder();

                for (int i = 0; i < eingabe.length(); i++) {
                    if (i % 2 == 0) {
                        start.append(eingabe.charAt(i));
                    } else {
                        try {
                            
                            ende.append(eingabe.charAt(i));
                        } catch (IndexOutOfBoundsException e) {
                        }
                    }

                }
                start.append(ende);
                return start.toString();
    }

    @Override
    public String dechiffriren(String eingabe) {
       StringBuilder klartext = new StringBuilder();

        int originalLength = eingabe.length();
        int centerIndex = eingabe.length() / 2 + (originalLength % 2 == 0 ? 0 : 1);
        String start = eingabe.substring(0, centerIndex);
        String end = eingabe.substring(centerIndex);

        for (int i = 0; i < start.length(); i++) {
            klartext.append(start.charAt(i));
            if(end.length() > i){
                  klartext.append(end.charAt(i));
            }
          
        }
        return klartext.toString();
    }
    
}
