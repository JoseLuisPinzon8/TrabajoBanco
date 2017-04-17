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
public class DividendStock extends Stock{
    private double dividends;

    public DividendStock(double dividends, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice);
        this.dividends = dividends;
    }

    public double getDividends() {
        return dividends;
    }

    public void setDividends(double dividends) {
        this.dividends = dividends;
    }
    
    
    @Override
    public double getMarketValue() {
        return (this.totalCost*this.totalShares)+this.dividends;
    }
}
