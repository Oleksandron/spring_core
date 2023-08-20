package org.example;

import org.example.beans.Cart;
import org.example.beans.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class Main {
    public static void main(String[] args) {
        ProductRepository pr = new ProductRepository();
        pr.addProdRep(1, "1 article", 11);
        pr.addProdRep(2, "2 article", 22);
        pr.addProdRep(3, "3 article", 33);
        pr.getAllProdRep();
        Cart one = new Cart();
        one.ennterValue(1, "1 article", 10);
    }
}