package Seminars.vending_machine;

import Seminars.vending_machine.product.Bottle;
import Seminars.vending_machine.product.Product;
import Seminars.vending_machine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("twix", 100);
        Product product2 = new Bottle("cola", 120, 2);
        Product product3 = new Product("bounty", 90);
        VendingMachine vm = new VendingMachine();
        vm.addProduct(product1);
        vm.addProduct(product2);
        vm.addProduct(product3);

        System.out.println(vm.getProductsListInfo());
    }
}
