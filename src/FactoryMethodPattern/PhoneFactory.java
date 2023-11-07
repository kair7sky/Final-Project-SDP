package FactoryMethodPattern;

import DecoratorPattern.Product;
// Класс PhoneFactory реализует фабричный метод для создания смартфонов (продуктов)
class PhoneFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Product(name, price);
    }
}