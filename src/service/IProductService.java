package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    void edit(int id, int price, String name);

    void remove(int id);

    List<Product> search(String name);

    void sortByName();
}