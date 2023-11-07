package FactoryMethodPattern;

import AdapterPattern.Laptop;
import DecoratorPattern.Product;
// Класс LaptopFactory реализует фабричный метод для создания ноутбуков (продуктов).
class LaptopFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Laptop(name, price);
    }
}