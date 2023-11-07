package DecoratorPattern;

import AdapterPattern.Laptop;
// Класс TaxDecorator представляет декоратор для налоговой надбавки к продукту (ноутбуку)
public class TaxDecorator extends Product {
    private double taxRate;
    // Конструктор класса, который принимает ноутбук и ставку налога при создании декоратора
    public TaxDecorator(Laptop product, double taxRate) {
        super(product.name, product.basePrice);
        this.taxRate = taxRate;
    }


// Метод calculatePrice переопределен для включения налоговой надбавки в итоговую цену
    @Override
    public double calculatePrice() {
        return super.calculatePrice() * (1 + taxRate);
    }
}