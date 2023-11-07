package FactoryMethodPattern;

import DecoratorPattern.Product;
// Класс ComputerFactory реализует фабричный метод для создания компьютеров (продуктов).
class ComputerFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Product(name, price);
    }
}