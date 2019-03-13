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
public interface ChiffrierTechniken {
     public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public String chiffriren(String eingabe);
    public String dechiffriren(String eingabe);
    
    
    
}
