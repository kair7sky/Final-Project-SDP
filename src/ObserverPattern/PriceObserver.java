package ObserverPattern;
// Класс PriceObserver представляет наблюдателя, который следит за изменениями цен в магазине.
public class PriceObserver {
    private String name;

    public PriceObserver(String name) {
        this.name = name;
    }
    // Метод update вызывается, когда наблюдатель получает уведомление о изменении цены товара.
    public void update(String item_name, double item_price) {
        System.out.println(name + " - Price of " + item_name + " is now $" + item_price);
    }
}

