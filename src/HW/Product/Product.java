package HW.Product;

import java.util.Objects;

public class Product {
    private final String name;
    private final Double price;
    private final Double quantity;
    private boolean checked;

    public Product(String name, Double price, Double quantity) {
        if (name == null || name.isBlank() || price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполните карточку товара");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.checked = false;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setChecked() {
        this.checked = true;
    }

    public boolean isChecked() {
       return checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Количество: %s, Куплен: %s", this.name, this.price, this.quantity, checkedString);
    }
}
