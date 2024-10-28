package ObserverPattern.Observable;

import ObserverPattern.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class iphoneObservableImp implements StocksObservable{

    private List<StockObserver> stockObserverList;
    private int stockCount;

    public iphoneObservableImp(){
        stockObserverList = new ArrayList<>();
        this.stockCount = 0;
    }

    @Override
    public void add(StockObserver stockObserver) {
        stockObserverList.add(stockObserver);
    }

    @Override
    public void remove(StockObserver stockObserver) {
        stockObserverList.remove(stockObserver);
    }

    @Override
    public void notifySubscribers() {
        stockObserverList.forEach((StockObserver s)-> {
            s.update();
        });
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

    @Override
    public void setStockCount(int newStock) {
        if(this.stockCount == 0)
            notifySubscribers();
        this.stockCount = this.stockCount + newStock;
    }
}
