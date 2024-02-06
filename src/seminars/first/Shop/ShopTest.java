package seminars.first.Shop;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
public class ShopTest {
public static void main(String[] args) {
    Shop sh = new Shop();
    List list = new ArrayList<>();
    list.add(new Product("apple", 150));
    sh.setProducts(list);
    sh.addProducts(new Product("orange", 130));
    sh.addProducts(new Product("ginger", 300));
    sh.addProducts(new Product("lemon", 80));
    sh.addProducts(new Product("banana", 100));
    sh.getSortedListProducts();

// правильное количество продуктов
    assertThat(sh.getProducts().size()).isEqualTo(5);
// правильность списка продуктов
    List list2 = new ArrayList<>();
    list2.add(sh.getProducts().get(1));
    list2.add(sh.getProducts().get(2));
    //list2.add(new Product("bread", 8));
    assertThat(sh.getProducts()).containsSequence(list2);

//Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
    assertThat(sh.getProducts().get(0).getTitle()).isEqualTo("ginger");

// Проверка сортировки
    assertThat(sh.getProducts().get(0).getTitle()).isEqualTo("ginger");
    assertThat(sh.getProducts().get(1).getTitle()).isEqualTo("apple");
    assertThat(sh.getProducts().get(2).getTitle()).isEqualTo("orange");
    assertThat(sh.getProducts().get(3).getTitle()).isEqualTo("banana");
    assertThat(sh.getProducts().get(4).getTitle()).isEqualTo("lemon");

}
    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
      2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */


    

   




}