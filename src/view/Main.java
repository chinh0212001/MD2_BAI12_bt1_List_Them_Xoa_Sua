package view;

import controller.ProductController;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ProductController productController = new ProductController();

    public Main() {
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Show product list");
            System.out.println("2. Add new product");
            System.out.println("3. Edit product");
            System.out.println("4. Delete product");
            System.out.println("5. Search products");
            System.out.println("6. Sort products");
            System.out.println("7. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    new ProductView().viewProducts();
                    break;
                case 2:
                    System.out.println("Enter product name");
                    String name = scanner.nextLine();
                    System.out.println("Enter product price");
                    int price = Integer.parseInt(scanner.nextLine());
                    productController.addProduct(price, name);
                    break;
                case 3:
                    System.out.println("Enter product id");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter product name");
                    String nameEdit = scanner.nextLine();
                    System.out.println("Enter product price");
                    int priceEdit = Integer.parseInt(scanner.nextLine());
                    productController.editProduct(idEdit, priceEdit, nameEdit);
                    break;
                case 4:
                    System.out.println("Enter product id");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    productController.deleteProduct(idDelete);
                    break;
                case 5:
                    System.out.println("Enter product name");
                    String nameSearch = scanner.nextLine();
                    System.out.println(productController.searchProduct(nameSearch));
                    break;
                case 6:
                    productController.sortProductByName();
                    System.out.println("Sorted");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }


    public static void main(String[] args) {
        new Main();
    }
}