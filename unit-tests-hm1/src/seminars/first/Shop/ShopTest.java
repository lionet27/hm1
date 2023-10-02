package seminars.first.Shop;

import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public ShopTest() {
    }

    public static void main(String[] args) {
        Shop shopTest = new Shop();
        shopTest.setProducts(getShuffleListProducts(getTestListProducts()));
        Assertions.assertThat(shopTest.getProducts()).hasSize(4);
        Assertions.assertThat(shopTest.getMostExpensiveProduct().getTitle()).isEqualTo(((Product)getTestListProducts().get(3)).getTitle());
        Assertions.assertThat(((Product)shopTest.sortProductsByPrice().get(0)).getCost()).isEqualTo(50);
        Assertions.assertThat(((Product)shopTest.sortProductsByPrice().get(1)).getCost()).isEqualTo(100);
        Assertions.assertThat(((Product)shopTest.sortProductsByPrice().get(2)).getCost()).isEqualTo(150);
        Assertions.assertThat(((Product)shopTest.sortProductsByPrice().get(3)).getCost()).isEqualTo(300);
    }

    static List<Product> getTestListProducts() {
        Product productA = new Product();
        productA.setTitle("A");
        productA.setCost(50);
        Product productB = new Product();
        productB.setTitle("B");
        productB.setCost(100);
        Product productC = new Product();
        productC.setTitle("C");
        productC.setCost(150);
        Product productD = new Product();
        productD.setTitle("D");
        productD.setCost(300);
        List<Product> productList = new ArrayList();
        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);
        return productList;
    }

    static List<Product> getShuffleListProducts(List<Product> productList) {
        Collections.shuffle(productList);
        return productList;
    }

}