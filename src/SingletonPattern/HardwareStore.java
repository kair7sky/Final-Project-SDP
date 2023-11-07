package SingletonPattern;
import java.util.HashMap;
// Класс HardwareStore представляет магазин аппаратных средств и реализует паттерн Singleton.
public class HardwareStore {
    private static final HardwareStore instance = new HardwareStore();
    private final HashMap<String, Double> inventory;

    private HardwareStore() {
        inventory = new HashMap<>();
    }

    public static HardwareStore getInstance() {
        return instance;
    }
    // Метод add_item добавляет товар в инвентарь магазина.
    public void add_item(String item_name, double item_price) {
        inventory.put(item_name, item_price);
    }
    // Метод get_item_price возвращает цену товара по его названию из инвентаря.
    public Double get_item_price(String item_name) {
        return inventory.get(item_name);
    }
}