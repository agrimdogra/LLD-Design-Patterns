package designpatterns.observer.StockMarket;


public class PaytmCustomers implements Observer {
    StockMarketStation stockMarketStation;

    public PaytmCustomers(StockMarketStation stockMarketStation) {
        this.stockMarketStation = stockMarketStation;
    }

    @Override
    public void update() {
        System.out.println("I am StockMarketNews");
        System.out.println(stockMarketStation.getRegisteredStocks());
    }

    @Override
    public void register() {
        stockMarketStation.register(this);
    }

    @Override
    public void deRegister() {
        stockMarketStation.remove(this);
    }
}
