/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeinversionesclase10;

/**
 *
 * @author Estudiante
 */
public class GestionDeInversionesClase10 {

    
    public static void main(String[] args) {
        Bank banco = new Bank();
        Cliente cliente1 = new Cliente ("s","as",65465,12,"jlpinzonr",1232133);
        Cliente cliente2 = new Cliente ("saasa", "quyewt",654564,22,"pipe",4564);
        
        Asset activo1 = new Cash(100);
        Asset activo2 = new Stock(2, "google", 100, 80);
        cliente1.addAsset(activo1);
        cliente1.addAsset(activo2);
        banco.addClients(cliente1);
        
        Asset activo3 = new MutualFund(2,"Samsung",20,50);
        cliente2.addAsset(activo3);
        banco.addClients(cliente2);
        double totalMercado = banco.getAllMarketValue();
        System.out.println("Total " + totalMercado);
    }
    
}
