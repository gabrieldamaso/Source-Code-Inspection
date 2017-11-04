/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

/**
 *
 * @author gabri
 */
public class App {
    public static void main(String[] args) {
        
        PapelMoeda papelMoeda = new PapelMoeda(10,1);
        
        TicketMachine ticketMachine = new TicketMachine(1);
        
        Troco troco = new Troco(1); 
        
        System.out.println(papelMoeda.toString());
        System.out.println(ticketMachine.toString());
        System.out.println(troco.toString());
        
    }
}
