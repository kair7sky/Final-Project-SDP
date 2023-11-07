import AdapterPattern.Laptop;
import AdapterPattern.LaptopAdapter;
import DecoratorPattern.Product;
import DecoratorPattern.TaxDecorator;
import ObserverPattern.PriceObserver;
import ObserverPattern.StockSubject;
import SingletonPattern.HardwareStore;
import StrategyPattern.DiscountPricingStrategy;
import StrategyPattern.MarkupPricingStrategy;
import StrategyPattern.PricingStrategy;
//Main
public class HardwareStoreApp {
    public static void main(String[] args) {
        // Получаем экземпляр HardwareStore (одиночка) для управления инвентарем магазина.
        HardwareStore hardwareStore = HardwareStore.getInstance();
        // Добавляем товары в инвентарь магазина.
        hardwareStore.add_item("Computer", 1000);
        hardwareStore.add_item("Phone", 500);
        hardwareStore.add_item("Laptop", 1500);
        // Используем стратегии ценообразования для вычисления цен на товары.
        PricingStrategy discountStrategy = new DiscountPricingStrategy();
        PricingStrategy markupStrategy = new MarkupPricingStrategy();
        // Создаем продукты и ноутбук для применения декоратора налога.
        Product computer = new Product("Desktop Computer", 800);
        Product phone = new Product("Smartphone", 400);
        Laptop laptop = new Laptop("Gaming Laptop", 1200);
        TaxDecorator taxLaptop = new TaxDecorator(laptop, 0.1);
        // Создаем адаптер для отображения информации о ноутбуке.
        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        // Создаем объекты для наблюдения за изменением цен.
        StockSubject stockSubject = new StockSubject();
        PriceObserver priceObserver1 = new PriceObserver("Observer 1");
        PriceObserver priceObserver2 = new PriceObserver("Observer 2");
        // Регистрируем наблюдателей.
        stockSubject.add_observer(priceObserver1);
        stockSubject.add_observer(priceObserver2);
        // Выводим информацию о товарах и действиях в магазине.
        System.out.println("Hardware Store Inventory:");
        System.out.println("Computer price with discount: $" + discountStrategy.calculatePrice(computer.calculatePrice()));
        System.out.println("Phone price with markup: $" + markupStrategy.calculatePrice(phone.calculatePrice()));
        System.out.println("Laptop price with tax: $" + taxLaptop.calculatePrice());
        System.out.println("Laptop Information:");
        System.out.println(laptopAdapter.getLaptopInfo());

        // Симулируем изменение цены и уведомляем наблюдателей.
        hardwareStore.add_item("Laptop", 1400);
        stockSubject.notify_observers("Laptop", 1400);
    }
}