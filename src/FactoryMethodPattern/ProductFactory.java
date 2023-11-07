package FactoryMethodPattern;

import DecoratorPattern.Product;
// Интерфейс ProductFactory определяет метод createProduct для создания продуктов
interface ProductFactory {
    Product createProduct(String name, double price);
}