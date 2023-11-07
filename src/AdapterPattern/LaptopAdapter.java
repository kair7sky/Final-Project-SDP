package AdapterPattern;

import DecoratorPattern.Product;
// Класс LaptopAdapter представляет адаптер для ноутбука, чтобы использовать его как продукт
public class LaptopAdapter extends Product {
    private Laptop laptop;
    // Конструктор класса, который принимает ноутбук и создает адаптер.
    public LaptopAdapter(Laptop laptop) {
        super(laptop.name, laptop.price);
        this.laptop = laptop;
    }
    // Метод getLaptopInfo возвращает информацию о ноутбуке.
    public String getLaptopInfo() {
        return "Name: " + laptop.name + ", Price: $" + laptop.price;
    }
}
