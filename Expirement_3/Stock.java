package Expirement_3;

public class Stock {
    private String symbol;
    private String name;
    private double previousPrice;
    private double currentPrice;

    public Stock() {
    }

    public Stock(String symbol, String name, double previousPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousPrice = previousPrice;
        this.currentPrice = currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousPrice() {
        return previousPrice;
    }

    public void setPreviousPrice(double previousPrice) {
        this.previousPrice = previousPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return this.currentPrice / this.previousPrice;
    }
}
