package Seminars.vending_machine.vending;

import Seminars.vending_machine.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private long id;
    private List<Product> productList;

    public VendingMachine() {
        this(new ArrayList<>());
    }

    public VendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Product findByName(String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public String getProductsListInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список продуктов:\n");
        for (Product product : productList) {
            sb.append(product).append("\n");
        }
        return sb.toString();
    }
}
