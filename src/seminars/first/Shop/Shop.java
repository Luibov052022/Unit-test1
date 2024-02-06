package seminars.first.Shop;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }


    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void addProducts(Product newProduct) {
        this.products.add(newProduct);
    }
    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public List<Product> getSortedListProducts() {
        products.sort(
                new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        int tmp = o2.getCost() - o1.getCost();
                        return tmp;
                    }
                }
        );
        return products;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct(List<Product> sorting) {
        return sorting.get(0);
    }
}