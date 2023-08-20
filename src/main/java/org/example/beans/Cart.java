package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class Cart {
    ProductRepository pdr = new ProductRepository();
    public void ennterValue(int id,String name, int price){
        pdr.addProdRep(id,name,price);
    }
    public void deleteValue(int id){
        pdr.prodRep.remove(id);
    }
    public void show(){
        pdr.getAllProdRep();
    }
}
