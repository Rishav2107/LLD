package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class Store implements StockObserver{

    private StocksObservable stocksObservable;
    public Store(StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("stock is back in store");
    }
}
