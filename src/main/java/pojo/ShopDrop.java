package pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (; index < (products.length - 1); index++) {
            products[index] = products[index + 1];
            products[index + 1] = null;
        }
        products[products.length - 1] = null;
        return products;
    }
}
