package com.example.firstapp;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MyMain {

   public static void main(String [] args) {

       List<Product> list = new ArrayList<>();
       list.add(new Product(1, "AAAA", 100));
       list.add(new Product(3, "CCC", 800));
       list.add(new Product(2, "BBB", 600));
       list.add(new Product(1, "DDD", 400));

       list.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList()).forEach(x->{
           System.out.println(x.getId()+" "+x.getName()+" "+ x.getPrice());
       });

   }
}

