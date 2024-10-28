package ObserverPattern.Observable;

import ObserverPattern.Observer.StockObserver;

public interface StocksObservable {
    void add(StockObserver stockObserver);
    void remove(StockObserver stockObserver);
    void notifySubscribers();
    int getStockCount();
    void setStockCount(int newStock);
}
