package DecoratorPattern;
// Класс Product представляет базовый продукт.
public class Product {
    String name;
    double basePrice;
    // Конструктор класса, принимающий имя и базовую цену продукта при создании
    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }
    // Конструктор класса по умолчанию (пустой).
    public Product() {

    }
    // Метод calculatePrice возвращает базовую цену продукта.
    public double calculatePrice() {
        return basePrice;
    }
}