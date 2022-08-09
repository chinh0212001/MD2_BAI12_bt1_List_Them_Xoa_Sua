package view;

import controller.ProductController;
import model.Product;

public class ProductView {
    ProductController productController = new ProductController();

    public void viewProducts() {
        System.out.println("_______________________________");
        System.out.println("|STT       PRICE       PRODUCT|");
        for (Product product : productController.showProductList()) {
            System.out.printf("|%3d %11d %13s|\n", product.getId(), product.getPrice(), product.getName());
        }
        System.out.println("-------------------------------");
    }

}