package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale [] products = new ProductForSale[3];
        products [0] = new Chocolate("Chocolate",50,"Mükemmel",1);
        products[1] = new Coke("Coke",40,"Kötü",2);
        products[2] = new Bread("Bread",10,"Güzel",3);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products ){
            product.showDetails();
        }

    }
}