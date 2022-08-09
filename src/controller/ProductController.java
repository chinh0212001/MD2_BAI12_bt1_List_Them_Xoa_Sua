package controller;

import model.Product;
import service.IProductService;
import service.ProductServiceIMPL;

import java.util.List;

public class ProductController {

    IProductService productService = new ProductServiceIMPL();

    public List<Product> showProductList() {
        return productService.findAll();
    }

    public void addProduct(int price, String name) {
        productService.save(new Product(showProductList().size() + 1, price, name));
    }

    public void editProduct(int id, int price, String name) {
        productService.edit(id, price, name);
    }

    public void deleteProduct(int id) {
        productService.remove(id);
    }

    public List<Product> searchProduct(String name) {
        return productService.search(name);
    }

    public void sortProductByName() {
        productService.sortByName();
    }

}