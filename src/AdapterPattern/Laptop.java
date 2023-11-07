package AdapterPattern;

import DecoratorPattern.Product;
// Класс Laptop представляет ноутбук и наследует функциональность класса Product
public class Laptop extends Product {
    public String name;
    public double basePrice;
    double price;
    // Конструктор класса, который принимает имя и цену ноутбука при создании
    public Laptop(String name, double price) {
        super(); // Вызов конструктора базового класса Product.
        this.name = name;
        this.price = price;
    }
}