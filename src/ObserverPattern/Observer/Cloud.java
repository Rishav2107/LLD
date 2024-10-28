package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class Cloud implements StockObserver{
    private StocksObservable stocksObservable;
    public Cloud(StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("stock is back in cloud");
    }
}
