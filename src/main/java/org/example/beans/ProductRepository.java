package org.example.beans;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class ProductRepository {
    Map<Integer, String> prodRep = new HashMap<Integer, String>();

    public void addProdRep(int id, String name, int price) {
        prodRep.put(id, name + " " + price);
    }
    public void getAllProdRep(){
        for(Map.Entry<Integer, String> item : prodRep.entrySet()){
            System.out.printf("Id: %d  Name + price: %s \n", item.getKey(), item.getValue());
        }
    }
    public String getOneProdRep(int id){
       String out =  "Id: " + id + "Name + price: " + prodRep.get(id);
       return out;
    }
}
