package ObserverPattern;
import java.util.ArrayList;
import java.util.List;
// Класс StockSubject представляет субъект (наблюдаемый объект) инвентаря магазина.
public class StockSubject {
    // Список наблюдателей, следящих за изменениями цен в инвентаре.
    private final List<PriceObserver> observers;
    // Конструктор класса инициализирует список наблюдателей при создании.
    public StockSubject() {
        observers = new ArrayList<>();
    }
    // Метод add_observer добавляет нового наблюдателя в список.
    public void add_observer(PriceObserver observer) {
        observers.add(observer);
    }

    public void remove_observer(PriceObserver observer) {
        observers.remove(observer);
    }
    // Метод notify_observers уведомляет всех наблюдателей об изменении цены товара.
    public void notify_observers(String item_name, double item_price) {
        for (PriceObserver observer : observers) {
            observer.update(item_name, item_price);
        }
    }
}
