import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;

import java.util.Date;

public class ProductMgmtApp {

    public static void main(String[] args) {

        Product[] products = new Product[3];
        products[0] = new Product(3128874119L, "Banana", new Date(2023, 1, 24), 124, 0.55);
        products[1] = new Product(2927458265L, "Apple", new Date(2022, 12, 9), 18, 1.09);
        products[2] = new Product(9189927460L, "Carrot", new Date(2023, 3, 31), 89, 2.99);

        printProducts(products);

    }

    private static void printProducts(Product[] products) {
        // print all products in JSON format
        System.out.println("JSON format:");
        for (Product product : products) {
            System.out.println(product.toJson());
        }

        // print all products in XML format
        System.out.println("\n XML format:");
        for (Product product : products) {
            System.out.println(product.toXML());
        }

        // print all products in CSV format
        System.out.println("\n CSV format:");
        for (Product product : products) {
            System.out.println(product.toCSV());
        }
    }

}