package HW.Product;

import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private final Set<Product> products;

    public Recipe(String name, Set<Product> products) throws IllegalAccessException {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
            throw new IllegalAccessException("Не заполнены все поля");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public float getRecipePrice() {
        float sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public Set<Product> getProducts(){
        return products;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
