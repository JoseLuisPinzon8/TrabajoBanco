/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeinversionesclase10;

import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Bank {
    private HashMap<String, Cliente> clients;
    
    public Bank(){
        this.clients=new HashMap<>(); //ABRE MEMOERIA PARA ADICIONAR CLIENBTES
    }
    
    public void addClients(Cliente client){
        this.clients.put(client.getEmail(), client);
    }
    
    public double getAllMarketValue(){
        double total = 0;
        for (Cliente client : this.clients.values()) {
            for(Asset asset : client.getAssets()){
                total+=asset.getMarketValue();
            }
        }
        return total;
    }
    
    public double getAllProfit(){
        double total = 0;
        for (Cliente client : this.clients.values()) {
            for(Asset asset : client.getAssets()){
                total+=asset.getProfit();
            }
        }
        return total;
    }
    
    public HashMap getAllByTypeAsset(){
        HashMap<String,Double> total = new HashMap();
        for(Cliente client : this.clients.values()){
            for(Asset asset : client.getAssets()){
                if(asset instanceof Cash){
                 if(!total.containsKey("cash")){
                     total.put("cash", asset.getMarketValue());
                 }else{
                     total.put("cash", total.get("cash") + asset.getMarketValue());// MAERA RESUMIDA
                     Double valorActual = total.get("cash");//MANERA NO RESUMIDA
                     Double nuevoValor = valorActual + asset.getMarketValue();//MANERA NO RESUMIDA
                     total.put("cash", nuevoValor);//MANERA NO RESUMIDA
                 }
            }else if(asset instanceof MutualFund){
                    if(!total.containsKey("MutualFund")){
                     total.put("MutualFund", asset.getMarketValue());
                 }else{
                     total.put("MutualFund", total.get("MutualFund") + asset.getMarketValue());// MAERA RESUMIDA
                     Double valorActual = total.get("MutualFund");//MANERA NO RESUMIDA
                     Double nuevoValor = valorActual + asset.getMarketValue();//MANERA NO RESUMIDA
                     total.put("MutualFund", nuevoValor);//MANERA NO RESUMIDA
                 }
            }else if(asset instanceof DividendStock){
                    if(!total.containsKey("DividendStock")){
                     total.put("DividendStock", asset.getMarketValue());
                 }else{
                     total.put("DividendStock", total.get("DividendStock") + asset.getMarketValue());// MAERA RESUMIDA
                     Double valorActual = total.get("DividendStock");//MANERA NO RESUMIDA
                     Double nuevoValor = valorActual + asset.getMarketValue();//MANERA NO RESUMIDA
                     total.put("DividendStock", nuevoValor);//MANERA NO RESUMIDA
                 }
            }else if(asset instanceof Stock){
                    if(!total.containsKey("Stock")){
                     total.put("Stock", asset.getMarketValue());
                 }else{
                     total.put("Stock", total.get("Stock") + asset.getMarketValue());// MAERA RESUMIDA
                     Double valorActual = total.get("Stock");//MANERA NO RESUMIDA
                     Double nuevoValor = valorActual + asset.getMarketValue();//MANERA NO RESUMIDA
                     total.put("Stock", nuevoValor);//MANERA NO RESUMIDA
                 }
            }
            }
        }
    return total;    
    }
    /*
    public Cliente getMaxProfit(){
        double maxProfit = 0;        
        for(Cliente client : this.clients.){
            
            for(Asset asset : client.getAssets()){

                 
            }
        }
        
      return null;
    }
*/
}
