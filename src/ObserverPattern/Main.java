package ObserverPattern;

import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observable.iphoneObservableImp;
import ObserverPattern.Observer.Cloud;
import ObserverPattern.Observer.StockObserver;
import ObserverPattern.Observer.Store;

public class Main {
    public static void main(String[] args) {
        StocksObservable stocksObservable = new iphoneObservableImp();

        StockObserver iphoneObserver = new Store(stocksObservable);
        stocksObservable.add(iphoneObserver);
        StockObserver cloudObserver = new Cloud(stocksObservable);
        stocksObservable.add(cloudObserver);

        stocksObservable.setStockCount(15);
        stocksObservable.setStockCount(-15);
        stocksObservable.setStockCount(10);
    }
}
