package Model;

import java.util.ArrayList;
import java.util.List;

class Observerable {
    private List<IObserver> observerList = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    public void removeObserver(IObserver observer) {
         observerList.remove(observer);
    }

    public void notifyObservers(){
        for (IObserver observer: observerList) {
            observer.updatePoems();
        }
    }
}
