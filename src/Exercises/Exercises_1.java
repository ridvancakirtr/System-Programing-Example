package Exercises;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Exercises_1 {
    Exercises_1(){
        HashMap<Integer, Product> hashMap = new HashMap<>();
        for (int i=0;i<3;i++){
            String namePriceProduct= JOptionPane.showInputDialog(null,i+".Enter Product Name,Price");
            ArrayList<String> arrayList= new ArrayList<>(Arrays.asList(namePriceProduct.split(",")));
            hashMap.put(i,new Product(arrayList.get(0),arrayList.get(1)));
        }

        String value=JOptionPane.showInputDialog(null,"Search Product by Name");

        for (Map.Entry<Integer, Product> entry:hashMap.entrySet()){
            if (entry.getValue().name.equals(value)){
                JOptionPane.showMessageDialog(null,"Your Product Price : "+entry.getValue().price);
            }
        }
    }
}

class Product{
    String name,price;
    Product(String name, String price) {
        this.name = name;
        this.price = price;
    }
}
