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
public class Caesar implements ChiffrierTechniken {

    @Override
    public String chiffriren(String eingabe) {
        int caesarOffset = 6;
        StringBuilder chiffrat = new StringBuilder();
        for (int i = 0; i < eingabe.length(); i++) {
            int index = ALPHABET.indexOf(eingabe.charAt(i));
            int neuerIndex = (index + caesarOffset) % ALPHABET.length();
            chiffrat.append(ALPHABET.charAt(neuerIndex));
        }
        return chiffrat.toString();
    
    }

    @Override
    public String dechiffriren(String eingabe) {
        
        int caesarOffset = 6;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < eingabe.length(); i++) {
            int index = ALPHABET.indexOf(eingabe.charAt(i));
            int neuerIndex = index - caesarOffset;
            if (neuerIndex < 0) {
                neuerIndex += ALPHABET.length();
            }

            sb.append(ALPHABET.charAt(neuerIndex));
        }
       return sb.toString();
    }

}
